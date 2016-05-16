package chessdiagram.generator;

import java.io.IOException;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import chessdiagram.Chess;
import chessdiagram.ChessdiagramFactory;
import chessdiagram.ChessdiagramPackage;
import chessdiagram.Colour;
import chessdiagram.Pawn;
import chessdiagram.Piece;
import chessdiagram.PieceType;
import chessdiagram.Player;
import chessdiagram.Square;

public class Generator {

	public static final PieceType[] Start = { PieceType.ROOK, PieceType.KNIGHT, PieceType.BISHOP, PieceType.KING,
			PieceType.QUEEN, PieceType.BISHOP, PieceType.KNIGHT, PieceType.ROOK };

	public void init() {

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("chess", new XMIResourceFactoryImpl());
		ChessdiagramPackage.eINSTANCE.eClass();
	}

	public Resource createResource(URI uri) {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(uri);
		return resource;
	}

	public Resource loadResource(URI uri) {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(uri, true);
		return resource;
	}

	public void saveResource(Resource resource) {
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			System.out.println("The following error occurred during saving the resource: " + e.getMessage());
		}
	}

	public Chess getModelFromResource(Resource resource) {
		// check the content in production code!
		Chess root = (Chess) resource.getContents().get(0);
		return root;
	}

	public Chess createChess() {
		ChessdiagramFactory factory = ChessdiagramFactory.eINSTANCE;
		Chess chess = factory.createChess();

		Player white = factory.createPlayer();
		white.setColour(Colour.WHITE);

		Player black = factory.createPlayer();
		black.setColour(Colour.BLACK);

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Square sq = factory.createSquare();
				if (((i + 1) % 2 != 0 && (j + 1) % 2 != 0) || ((i + 1) % 2 == 0 && (j + 1) % 2 == 0)) {
					sq.setColour(Colour.BLACK);
					sq.setId(i * 8 + j);
					chess.getSquare().add(sq);
				} else {
					sq.setColour(Colour.WHITE);
					sq.setId(i * 8 + j);
					chess.getSquare().add(sq);
				}
			}
		}

		for (int i = 0; i < 8; i++) {
			white.getPiece().add(createPiece(factory, PieceType.PAWN, Colour.WHITE, 6, i));
		}
		for (int i = 0; i < 8; i++) {
			white.getPiece().add(createPiece(factory, Start[i], Colour.WHITE, 7, i));
		}

		for (int i = 0; i < 8; i++) {
			black.getPiece().add(createPiece(factory, PieceType.PAWN, Colour.BLACK, 1, i));
		}
		for (int i = 0; i < 8; i++) {
			black.getPiece().add(createPiece(factory, Start[i], Colour.BLACK, 0, i));
		}

////		black.getPiece().add(createPiece(factory, PieceType.PAWN, Colour.BLACK, 1, 0));
//		//white.getPiece().add(createPiece(factory, PieceType.QUEEN, Colour.WHITE, 6, 3));
//		white.getPiece().add(createPiece(factory, PieceType.KING, Colour.WHITE, 6, 1));
////		white.getPiece().add(createPiece(factory, PieceType.PAWN, Colour.WHITE, 5, 0));
////		white.getPiece().add(createPiece(factory, PieceType.PAWN, Colour.WHITE, 5, 1));
////		white.getPiece().add(createPiece(factory, PieceType.PAWN, Colour.WHITE, 5, 6));
//		// black.getPiece().add(createPiece(factory, PieceType.QUEEN,
//		// Colour.WHITE, 0, 0));
		chess.setBlackPlayer(black);
		chess.setWhitePlayer(white);

		return chess;
	}

	public Piece createPiece(ChessdiagramFactory factory, PieceType pieceType, Colour c, int i, int j) {
		int location = i * 8 + j;
		Piece piece;
		if (pieceType == PieceType.PAWN) {

			Pawn pawn = factory.createPawn();
			pawn.setPieceType(PieceType.PAWN);
			pawn.setFirstMove(true);
			pawn.setEnPassantEnabled(false);
			pawn.setPos(location);
			pawn.setColour(c);
			return pawn;
		}
		if (pieceType == PieceType.KNIGHT) {
			piece = factory.createKnight();
			piece.setPieceType(PieceType.KNIGHT);

		} else if (pieceType == PieceType.BISHOP) {
			piece = factory.createBishop();
			piece.setPieceType(PieceType.BISHOP);

		} else if (pieceType == PieceType.ROOK) {

			piece = factory.createRook();
			piece.setPieceType(PieceType.ROOK);

		} else if (pieceType == PieceType.KING) {
			piece = factory.createKing();
			piece.setPieceType(PieceType.KING);

		} else {
			piece = factory.createQueen();
			piece.setPieceType(PieceType.QUEEN);
		}
		if (pieceType != PieceType.PAWN) {
			piece.setPos(location);
			piece.setColour(c);
			return piece;
		}
		return null;

	}

	public Square getN(Chess chess, int i, int j) {
		// System.out.println(chess.getSquare().size());
		return chess.getSquare().get(i * 8 - 8);
	}

	public Square getNE(Chess chess, int i, int j) {
		// System.out.println(chess.getSquare().size());
		return chess.getSquare().get(i * 8 + -7);
	}

	public Square getE(Chess chess, int i, int j) {
		// System.out.println(chess.getSquare().size());
		return chess.getSquare().get(i * 8 + j + 1);
	}

	public Square getSE(Chess chess, int i, int j) {
		// System.out.println(chess.getSquare().size());
		return chess.getSquare().get(i * 8 + j + 9);
	}

	public Square getS(Chess chess, int i, int j) {
		// System.out.println(chess.getSquare().size());
		return chess.getSquare().get(i * 8 + j + 8);
	}

	public Square getSW(Chess chess, int i, int j) {
		// System.out.println(chess.getSquare().size());
		return chess.getSquare().get(i * 8 + j + 7);
	}

	public Square getW(Chess chess, int i, int j) {
		// System.out.println(chess.getSquare().size());
		return chess.getSquare().get(i * 8 + j - 1);
	}

	public Square getNW(Chess chess, int i, int j) {
		// System.out.println(chess.getSquare().size());
		return chess.getSquare().get(i * 8 + j - 9);
	}

	public static void removePiece(Chess chess, Piece piece) {
		switch (piece.getColour()) {
		case WHITE: {
			chess.getWhitePlayer().getPiece().remove(piece);
		}
		case BLACK: {
			chess.getBlackPlayer().getPiece().remove(piece);
		}
		default: {
		}
		}
	}

	public static void setEnpassantFalse(Chess chess) {
		for (Piece pieceType : chess.getWhitePlayer().getPiece()) {
			if (pieceType.getPieceType() == PieceType.PAWN) {
				Pawn pawn = (Pawn) pieceType;
				pawn.setEnPassantEnabled(false);
			}
		}
		for (Piece pieceType : chess.getBlackPlayer().getPiece()) {
			if (pieceType.getPieceType() == PieceType.PAWN) {
				Pawn pawn = (Pawn) pieceType;
				pawn.setEnPassantEnabled(false);
			}
		}

	}

}
