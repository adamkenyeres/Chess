package model.transformation

import chessdiagram.Chess
import chessdiagram.ChessdiagramFactory
import chessdiagram.Colour
import chessdiagram.Piece
import chessdiagram.PieceType
import chessdiagram.Square
import java.util.ArrayList
import java.util.Random
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.viatra.dse.api.DesignSpaceExplorer
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements
import org.eclipse.viatra.transformation.runtime.emf.rules.BatchTransformationRuleGroup
import chess.queries.BlackPawnMovesMatch
import chessdiagram.Pawn
import chess.queries.BlackPawnMovesMatcher
import chessdiagram.Rook
import chess.queries.RookMovesMatcher
import chessdiagram.Knight
import chess.queries.BlackKnightMovesMatcher
import java.util.function.BiConsumer
import chessdiagram.Bishop
import chess.queries.BishopMovesMatcher
import chessdiagram.Queen
import chess.queries.QueenMovesMatcher
import chessdiagram.King
import chess.queries.KingMovesMatcher

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
	public Chess chess
	protected ChessdiagramFactory factory
	protected DesignSpaceExplorer dse
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
	var whitePawnMovesRule = WhitePawnMovesRule.getWhitePawnMovesRule(chess)
	var blackPawnMovesRule = BlackPawnMovesRule.getBlackPawnMovesRule(chess)
	var rookMovesRule = RookMovesRule.getRookMovesRule(chess)
	var whiteKnightMovesRule = WhiteKnightRule.getWhiteKnightMovesRule(chess)
	var blackKnightMovesRule = BlackKnightRule.getBlackKnightMovesRule(chess)
	var bishopMovesRule = BishopMovesRule.getBishopMovesRule(chess)
	var queenMovesRule = QueenMovesRule.getQueenMovesRule(chess)
	var kingMovesRule = KingMovesRule.getKingMovesRule(chess)
	var blackBishopMovesRule = BishopMovesRule.getBlackBishopMovesRule(chess);
	var ruleGroup = new ArrayList
	var ruleGroups = new BatchTransformationRuleGroup

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
				bishopMovesColourRule.fireAllCurrent(new Pair("bishop", p))
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
				bishopMovesColourRule.fireAllCurrent(new Pair("bishop", p))
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
		val oldPos = p.pos; // The position before moving
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
		if (oldPos != p.pos) { // If the old position!=piece position -> We moved -> the other opponents turn
			chess.whitePlayerTurn = !chess.whitePlayerTurn;
		}
	}

	def moveBlackPiece(Square destinationSquare) {
		val p = clickedSquare.piece
		val oldPos = p.pos; // The position before moving
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
		if (oldPos != p.pos) { // If the old position!=piece position -> We moved -> the other opponents turn
			chess.whitePlayerTurn = !chess.whitePlayerTurn;
		}
	}

	def moveBlackPieceRandomly(Piece p) {
		val oldPos = p.pos;

		switch (p.pieceType) {
			case PieceType.PAWN: {
				var pawn = p as Pawn
				var matcher = BlackPawnMovesMatcher.on(engine)
				val match = matcher.getOneArbitraryMatch(pawn, null)
				if (match != null)
					blackPawnMovesRule.fireOne(new Pair("piece", p), new Pair("square", match.square))
			}
			case PieceType.ROOK: {
				var rook = p as Rook
				var matcher = RookMovesMatcher.on(engine)
				val match = matcher.getOneArbitraryMatch(rook, null)
				if (match != null)
					rookMovesRule.fireOne(new Pair("rook", rook), new Pair("square", match.square))

			}
			case PieceType.KNIGHT: {
				var knight = p as Knight
				var matcher = BlackKnightMovesMatcher.on(engine)
				var match = matcher.getOneArbitraryMatch(knight, null)
				if (match != null)
					blackKnightMovesRule.fireOne(new Pair("piece", knight), new Pair("square", match.square))

			}
			case PieceType.BISHOP: {
				var bishop = p as Bishop
				var matcher = BishopMovesMatcher.on(engine)
				var match = matcher.getOneArbitraryMatch(bishop, null)
				if (match != null)
					bishopMovesRule.fireOne(new Pair("piece", bishop), new Pair("square", match.square))

			}
			case PieceType.QUEEN: {
				var queen = p as Queen
				var matcher = QueenMovesMatcher.on(engine)
				var match = matcher.getOneArbitraryMatch(queen, null)
				if (match != null)
					queenMovesRule.fireOne(new Pair("queen", queen), new Pair("square", match.square))

			}
			case PieceType.KING: {
				var king = p as King
				var matcher = KingMovesMatcher.on(engine)
				var match = matcher.getOneArbitraryMatch(king, null)
				if (match != null)
					kingMovesRule.fireOne(new Pair("king", king), new Pair("square", match.square))
			}
			default: {
				println("Error")
			}
		}
		if (oldPos != p.pos) { // If the old position!=piece position -> We moved -> the other opponents turn
			chess.whitePlayerTurn = !chess.whitePlayerTurn;
		}
	}

	public def movePiece(Square destinationSquare) {
		switch (clickedSquare.piece.colour) {
			case Colour.WHITE: {
				if (chess.whitePlayerTurn) {
					moveWhitePiece(destinationSquare)
				// chess.whitePlayerTurn = !chess.whitePlayerTurn;
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

	new(Resource resource, Chess chess) {
		this.resource = resource
		// Create EMF scope and EMF IncQuery engine based on the resource
		val scope = new EMFScope(resource)
		engine = ViatraQueryEngine.on(scope);
		clickedSquare = null
		this.chess = chess

		whitePawnMovesRule = WhitePawnMovesRule.getWhitePawnMovesRule(chess)
		blackPawnMovesRule = BlackPawnMovesRule.getBlackPawnMovesRule(chess)
		rookMovesRule = RookMovesRule.getRookMovesRule(chess)
		whiteKnightMovesRule = WhiteKnightRule.getWhiteKnightMovesRule(chess)
		blackKnightMovesRule = BlackKnightRule.getBlackKnightMovesRule(chess)
		bishopMovesRule = BishopMovesRule.getBishopMovesRule(chess)
		queenMovesRule = QueenMovesRule.getQueenMovesRule(chess)
		kingMovesRule = KingMovesRule.getKingMovesRule(chess)
		blackBishopMovesRule = BishopMovesRule.getBlackBishopMovesRule(chess);
		ruleGroups.add(blackPawnMovesRule)
		ruleGroups.add(blackKnightMovesRule)

		ruleGroup.add(blackKnightMovesRule)
		ruleGroup.add(blackPawnMovesRule)

		createTransformation

	}

	public def moveBlackPlayer() {
		while (!chess.isWhitePlayerTurn && chess.blackPlayer.piece!=null) {
			var rand = new Random()
			var index = rand.nextInt(chess.blackPlayer.piece.size)
			var piece = chess.blackPlayer.piece.get(index)
			moveBlackPieceRandomly(piece)
		}
	
	}

	public def execute(Square square) {
//      Fire the defined rules here
		if (clickedSquare == null) {
			if (square.piece != null) {
				if (square.piece != null) {
					colourSquare(clickedSquare, square)
					clickedSquare = square
				}
			}
		} else {
			movePiece(square)
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

// allMovesRule.fireAllCurrent(new MatchParameterFilter(new Pair("piece", clickedSquare.piece)))
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
