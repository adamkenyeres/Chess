package chessdiagram.generator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TransformAttribute;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.transformation.runtime.emf.rules.TransformationRuleGroup;
import org.junit.Test;

import chess.queries.AllMovessMatcher;
import chess.queries.WhiteMovesMatch;
import chess.queries.WhiteMovesMatcher;
import chess.queries.WhitePawnMovesMatch;
import chess.queries.WhitePawnMovesMatcher;

import chess.queries.util.AllMovessProcessor;
import chess.queries.util.WhiteMovesProcessor;
import chess.queries.util.WhitePawnMovesProcessor;
import chessdiagram.Chess;
import chessdiagram.Colour;
import chessdiagram.Pawn;
import chessdiagram.Piece;
import chessdiagram.PieceType;
import chessdiagram.Square;
import model.transformation.ModelTransformation;

public class BoardVisualizer implements ActionListener {
	ModelTransformation transformation;
	private Chess chess;
	private ViatraQueryEngine engine;
	Resource resource;
	private JPanel board;
	private JFrame jf;
	private JPanel jp;
	private JButton New;
	private JButton exit;
	private JButton back;
	Square clickedSquare;
	public JButton btn[][];
	private final String COLS = "ABCDEFGH";
	private static final int Queen = 0, King = 1, Rook = 2, Knight = 3, Bishop = 4, Pawn = 5;
	public static final int[] Start = { Rook, Knight, Bishop, King, Queen, Bishop, Knight, Rook }; // Starting
																									// order
	public static final int Black = 0, White = 1;
	public int colourMove = White;
	// private static final boolean Piece = false;
	private static Image[][] pieceImages;

	public BoardVisualizer(Chess chess, Resource resource) throws ViatraQueryException {
		getImage();
		this.chess = chess;
		board = new JPanel();
		board.setLayout(new GridLayout(9, 8));
		board.setPreferredSize(new Dimension(600, 600));
		DrawBoard();
		jf = new JFrame("Chess");
		jp = new JPanel();
		New = new JButton("New Game");
		New.setName("New");
		exit = new JButton("Exit");
		exit.setName("Exit");
		back = new JButton("Back");
		back.setName("Back");
		GridBagConstraints c = new GridBagConstraints();
		jf.setSize(800, 700);
		jf.setVisible(true);

		jp.setLayout(new GridBagLayout());

		c.gridx = 0;
		c.gridy = 2;
		c.insets = new Insets(20, 20, 20, 20);
		jp.add(New, c);
		c.gridx = 0;
		c.gridy = 4;
		c.insets = new Insets(10, 10, 10, 10);
		jp.add(exit, c);
		c.gridx = 0;
		c.gridy = 6;
		c.insets = new Insets(10, 10, 10, 10);
		jp.add(back, c);
		jf.getContentPane().add(jp, BorderLayout.WEST);
		jf.getContentPane().add(board, BorderLayout.CENTER);
		engine = ViatraQueryEngine.on(new EMFScope(resource/* or resourceSet */));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.resource = resource;
		transformation = new ModelTransformation(resource, chess);
		New.addActionListener(this);
		exit.addActionListener(this);
		clickedSquare = null;

	}

	public void getImage() {
		pieceImages = new Image[2][6];
		try {

			// URL url = new URL("pieces.png");
			BufferedImage img = ImageIO.read(new File("pieces.png"));
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 6; j++) {
					pieceImages[i][j] = img.getSubimage(j * 64, i * 64, 64, 64);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public void DrawBoard() {
		btn = new JButton[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				btn[i][j] = new JButton();

				if (chess.getSquare().get(i * 8 + j).getColour() == Colour.WHITE) {
					btn[i][j].setBackground(Color.WHITE);
				} else if (chess.getSquare().get(i * 8 + j).getColour() == Colour.BLACK) {
					btn[i][j].setBackground(Color.BLACK);
				} else {
					btn[i][j].setBackground(Color.RED);
				}
				btn[i][j].setName("" + (chess.getSquare().get(i * 8 + j).getId()));
				btn[i][j].addActionListener(this);

			}
		}
		board.add(new JLabel(""));
		for (int i = 0; i < 8; i++) {
			board.add(new JLabel(COLS.substring(i, i + 1), SwingConstants.CENTER));
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				switch (j) {
				case 0:
					board.add(new JLabel("" + (i + 1), SwingConstants.CENTER));
					break;

				default:
					board.add(btn[i][j - 1]);
					break;
				}
			}
		}
	}

	public void refresh() throws ExecutionException {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				btn[i][j].setIcon(null);
			}
		}
		for (int i = 0; i < chess.getWhitePlayer().getPiece().size(); i++) {
			Piece p = chess.getWhitePlayer().getPiece().get(i);
			addPiece(p.getPieceType(), Colour.WHITE, p.getPos());
		}
		for (int i = 0; i < chess.getBlackPlayer().getPiece().size(); i++) {
			Piece p = chess.getBlackPlayer().getPiece().get(i);
			addPiece(p.getPieceType(), Colour.BLACK, p.getPos());
		}

	}

	public void addPiece(PieceType t, Colour c, int location) {
		int i = location / 8;
		int j = location % 8;
		btn[i][j].setIcon(new ImageIcon(pieceImages[c.getValue()][t.getValue()]));
	}

	public void colourRedSquares() {
		for (Square sq : chess.getSquare()) {
			if (sq.getColour() == Colour.RED) {
				int i = sq.getId() / 8;
				int j = sq.getId() % 8;
				btn[i][j].setBackground(Color.RED);
			}
		}
	}

	public void uncolourRedSquares() {
		for (Square sq : chess.getSquare()) {
			if (sq.getColour() == Colour.RED) {
				int i = sq.getId() / 8;
				int j = sq.getId() % 8;
				if (((i + 1) % 2 != 0 && (j + 1) % 2 != 0) || ((i + 1) % 2 == 0 && (j + 1) % 2 == 0)) {
					sq.setColour(Colour.BLACK);
					btn[i][j].setBackground(Color.BLACK);
				} else {
					sq.setColour(Colour.WHITE);
					btn[i][j].setBackground(Color.WHITE);
				}
			}
		}
	}

	public void showMoves(Piece p) throws ViatraQueryException {
		AllMovessMatcher matcher = AllMovessMatcher.on(engine);

		matcher.forEachMatch(matcher.newMatch(p, null), new AllMovessProcessor() {

			@Override
			public void process(Piece pPiece, Square pSquare) { // TODO
				// Auto-generated method stub //
				// pSquare.setColour(Colour.RED);
			}
		});

		colourRedSquares();
	}

	public void castling(chessdiagram.Piece king, chessdiagram.Piece rook) {
		int kingPos = king.getPos();
		int rookPos = rook.getPos();
		if (kingPos > rookPos) {
			rook.setPos(kingPos - 1);
			king.setPos(rook.getPos() - 1);
		} else {
			rook.setPos(kingPos + 1);
			king.setPos(rook.getPos() + 1);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();
		String name = button.getName();
		System.out.println(name);

		if (name.equals("New")) {
			try {
				refresh();
			} catch (ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (name.equals("Exit")) {
			System.exit(1);
		} else {
			Square square = chess.getSquare().get(Integer.parseInt(name));
			uncolourRedSquares();
			transformation.execute(square);
			colourRedSquares();
			try {
				refresh();
			} catch (ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

}
