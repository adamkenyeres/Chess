package model.transformation

import chess.queries.BishopMovesMatcher
import chess.queries.BlackKnightMovesMatcher
import chess.queries.BlackPawnMovesMatcher
import chess.queries.KingMovesMatcher
import chess.queries.QueenMovesMatcher
import chess.queries.RookMovesMatcher
import chessdiagram.Bishop
import chessdiagram.Chess
import chessdiagram.ChessdiagramFactory
import chessdiagram.Colour
import chessdiagram.King
import chessdiagram.Knight
import chessdiagram.Pawn
import chessdiagram.Piece
import chessdiagram.PieceType
import chessdiagram.Queen
import chessdiagram.Rook
import chessdiagram.Square
import dse.ChessEngine
import java.util.Random
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements
import chessdiagram.Board
import chessdiagram.generator.BoardVisualizer

class ModelTransformation {

	/* Transformation-related extensions */
	extension BatchTransformation transformation
	extension BatchTransformationStatements statements

	/* Transformation rule-related extensions */
// extension BatchTransformationRuleFactory = new BatchTransformationRuleFactory
	extension IModelManipulations manipulation

	protected ViatraQueryEngine engine
	protected Resource resource
	protected Square clickedSquare
	protected Chess chess
	protected ChessdiagramFactory factory

	protected BoardVisualizer visualizer;
	/*Coloring the possible move squares */
	val whitePawnMovesColourRule = WhitePawnMovesRule.getWhitePawnMovesColourRule(chess)
	val blackPawnMovesColourRule = BlackPawnMovesRule.getBlackPawnMovesColourRule()
	val rookMovesColourRule = RookMovesRule.getRookMovesColourRule()
	val whiteKnightMovesColourRule = WhiteKnightRule.getWhiteKnightsColourRule()
	val blackKnightMovesColourRule = BlackKnightRule.getBlackKnightsColourRule()
	val bishopMovesColourRule = BishopMovesRule.getBishopMovesColourRule()
	val queenMovesColourRule = QueenMovesRule.getQueenMovesColourRule()
	val kingMovesColourRule = KingMovesRule.getKingMovesColourRule()
	/*Moving the pieces */
	var whitePawnMovesRule = WhitePawnMovesRule.getWhitePawnMovesRule()
	var blackPawnMovesRule = BlackPawnMovesRule.getBlackPawnMovesRule()
	var rookMovesRule = RookMovesRule.getRookMovesRule()
	var whiteKnightMovesRule = WhiteKnightRule.getWhiteKnightMovesRule()
	var blackKnightMovesRule = BlackKnightRule.getBlackKnightMovesRule()
	var bishopMovesRule = BishopMovesRule.getBishopMovesRule()
	var queenMovesRule = QueenMovesRule.getQueenMovesRule()
	var kingMovesRule = KingMovesRule.getKingMovesRule()

	public def colourWhitePieceMoves(Piece p) {

		switch (p.pieceType) {
			case PieceType.PAWN: {
				whitePawnMovesColourRule.fireAllCurrent(new Pair("piece", p))

			}
			case PieceType.ROOK: {
				rookMovesColourRule.fireAllCurrent(new Pair("rook", p))
			}
			case PieceType.KNIGHT: {
				whiteKnightMovesColourRule.fireAllCurrent(new Pair("piece", p))
			}
			case PieceType.BISHOP: {
				bishopMovesColourRule.fireAllCurrent(new Pair("piece", p))
			}
			case PieceType.QUEEN: {
				queenMovesColourRule.fireAllCurrent(new Pair("queen", p))
			}
			case PieceType.KING: {
				kingMovesColourRule.fireAllCurrent(new Pair("king", p))
			}
			default: {
				println("Error")
			}
		}
	}

	public def colourBlackPieceMoves(Piece p) {

		switch (p.pieceType) {
			case PieceType.PAWN: {
				blackPawnMovesColourRule.fireAllCurrent(new Pair("piece", p))
			}
			case PieceType.ROOK: {
				rookMovesColourRule.fireAllCurrent(new Pair("rook", p))
			}
			case PieceType.KNIGHT: {
				blackKnightMovesColourRule.fireAllCurrent(new Pair("piece", p))
			}
			case PieceType.BISHOP: {
				bishopMovesColourRule.fireAllCurrent(new Pair("piece", p))
			}
			case PieceType.QUEEN: {
				queenMovesColourRule.fireAllCurrent(new Pair("queen", p))
			}
			case PieceType.KING: {
				kingMovesColourRule.fireAllCurrent(new Pair("king", p))
			}
			default: {
				println("Error")
			}
		}
	}

	public def colourSquare(Square clickedSquare, Square square) {
		switch (square.piece.colour) {
			case Colour.WHITE: {
				if (chess.whitePlayerTurn)
					colourWhitePieceMoves(square.piece)
			}
			case Colour.BLACK: {
				if (!chess.whitePlayerTurn)
					colourBlackPieceMoves(square.piece)
			}
			default: {
				println("Error: The selected square colour doesn't exist")
			}
		}
	}

	public def moveWhitePiece(Square destinationSquare) {
		val p = clickedSquare.piece
		switch (p.pieceType) {
			case PieceType.PAWN: {
				whitePawnMovesRule.fireAllCurrent(new Pair("piece", p), new Pair("square", destinationSquare))
			}
			case PieceType.ROOK: {
				rookMovesRule.fireAllCurrent(new Pair("rook", p), new Pair("square", destinationSquare))
			}
			case PieceType.KNIGHT: {
				whiteKnightMovesRule.fireAllCurrent(new Pair("piece", p), new Pair("square", destinationSquare))
			}
			case PieceType.BISHOP: {
				bishopMovesRule.fireAllCurrent(new Pair("piece", p), new Pair("square", destinationSquare))
			}
			case PieceType.QUEEN: {
				queenMovesRule.fireAllCurrent(new Pair("queen", p), new Pair("square", destinationSquare))
			}
			case PieceType.KING: {
				kingMovesRule.fireAllCurrent(new Pair("king", p), new Pair("square", destinationSquare))
			}
			default: {
				println("Error")
			}
		}

	}

	def moveBlackPiece(Square destinationSquare) {
		val p = clickedSquare.piece
		switch (p.pieceType) {
			case PieceType.PAWN: {
				blackPawnMovesRule.fireAllCurrent(new Pair("piece", p), new Pair("square", destinationSquare))
			}
			case PieceType.ROOK: {
				rookMovesRule.fireAllCurrent(new Pair("rook", p), new Pair("square", destinationSquare))
			}
			case PieceType.KNIGHT: {
				blackKnightMovesRule.fireAllCurrent(new Pair("piece", p), new Pair("square", destinationSquare))
			}
			case PieceType.BISHOP: {
				bishopMovesRule.fireAllCurrent(new Pair("bishop", p), new Pair("square", destinationSquare))
			}
			case PieceType.QUEEN: {
				queenMovesRule.fireAllCurrent(new Pair("queen", p), new Pair("square", destinationSquare))
			}
			case PieceType.KING: {
				kingMovesRule.fireAllCurrent(new Pair("king", p), new Pair("square", destinationSquare))
			}
			default: {
				println("Error")
			}
		}

	}

	def moveBlackPieceRandomly(Piece p) {
		switch (p.pieceType) {
			case PieceType.PAWN: {
				var pawn = p as Pawn
				var matcher = BlackPawnMovesMatcher.on(engine)
				val match = matcher.getOneArbitraryMatch(pawn, null, null)
				if (match != null)
					blackPawnMovesRule.fireOne(new Pair("piece", p), new Pair("square", match.square))
			}
			case PieceType.ROOK: {
				var rook = p as Rook
				var matcher = RookMovesMatcher.on(engine)
				val match = matcher.getOneArbitraryMatch(rook, null, null)
				if (match != null)
					rookMovesRule.fireOne(new Pair("rook", rook), new Pair("square", match.square))

			}
			case PieceType.KNIGHT: {
				var knight = p as Knight
				var matcher = BlackKnightMovesMatcher.on(engine)
				var match = matcher.getOneArbitraryMatch(knight, null, null)
				if (match != null)
					blackKnightMovesRule.fireOne(new Pair("piece", knight), new Pair("square", match.square))

			}
			case PieceType.BISHOP: {
				var bishop = p as Bishop
				var matcher = BishopMovesMatcher.on(engine)
				var match = matcher.getOneArbitraryMatch(bishop, null, null)
				if (match != null)
					bishopMovesRule.fireOne(new Pair("piece", bishop), new Pair("square", match.square))

			}
			case PieceType.QUEEN: {
				var queen = p as Queen
				var matcher = QueenMovesMatcher.on(engine)
				var match = matcher.getOneArbitraryMatch(queen, null, null)
				if (match != null)
					queenMovesRule.fireOne(new Pair("queen", queen), new Pair("square", match.square))

			}
			case PieceType.KING: {
				var king = p as King
				var matcher = KingMovesMatcher.on(engine)
				var match = matcher.getOneArbitraryMatch(king, null, null)
				if (match != null)
					kingMovesRule.fireOne(new Pair("king", king), new Pair("square", match.square))
			}
			default: {
				println("Error")
			}
		}
	}

	public def movePiece(Square destinationSquare) {
		switch (clickedSquare.piece.colour) {
			case Colour.WHITE: {
				if (chess.whitePlayerTurn) {
					moveWhitePiece(destinationSquare)
				}

			}
			case Colour.BLACK: {
				if (!chess.whitePlayerTurn) {
				}
			}
			default: {
			}
		}
	}

	new(Resource resource) {
		this.resource = resource
		// Create EMF scope and EMF IncQuery engine based on the resource
		val scope = new EMFScope(resource)
		engine = ViatraQueryEngine.on(scope);
		clickedSquare = null
		createTransformation

	}

	new(Resource resource, Chess chess, BoardVisualizer visualizer) {
		this.resource = resource
		// Create EMF scope and EMF IncQuery engine based on the resource
		val scope = new EMFScope(resource)
		engine = ViatraQueryEngine.on(scope);
		clickedSquare = null
		this.chess = chess
		this.visualizer = visualizer
		createTransformation
	}

	public def moveBlackPlayer() {
		/*Start exploring after white player's move */
		var dse = new ChessEngine(chess, this)
//		dse.start
		dse.startExploaring
		if (!dse.solutionsIsEmpty) {
			dse.doNextStep
		} else {
			println("Random move")
			while (!chess.isWhitePlayerTurn && chess.blackPlayer.piece != null) {
				var rand = new Random()
				var index = rand.nextInt(chess.blackPlayer.piece.size)
				var piece = chess.blackPlayer.piece.get(index)
				moveBlackPieceRandomly(piece)
			}

		}

	}

	public def execute(Square square, BoardVisualizer vis) {
//      Fire the defined rules here
		if (clickedSquare == null) {
			if (square.piece != null) {
				if (square.piece != null) {
					colourSquare(clickedSquare, square)
					clickedSquare = square
				}
			}
		} else {
			if (chess.isWhitePlayerTurn) {
				movePiece(square)

			}
			if (!chess.isWhitePlayerTurn) {
				clickedSquare = null
				moveBlackPlayer
			} else {
				if (square.piece != null) {
					colourSquare(clickedSquare, square)
					clickedSquare = square
				}
			}
		}
	}

	private def createTransformation() {
		// Create VIATRA model manipulations
		this.manipulation = new SimpleModelManipulations(engine)
		// Create VIATRA Batch transformation
		transformation = BatchTransformation.forEngine(engine).build
		// Initialize batch transformation statements
		statements = transformation.transformationStatements
	}

	def dispose() {
		if (transformation != null) {
			transformation.ruleEngine.dispose
		}
		transformation = null
		return
	}
}
