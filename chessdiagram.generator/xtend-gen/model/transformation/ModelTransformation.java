package model.transformation;

import chess.queries.BishopMovesMatch;
import chess.queries.BishopMovesMatcher;
import chess.queries.BlackKnightMovesMatch;
import chess.queries.BlackKnightMovesMatcher;
import chess.queries.BlackPawnMovesMatch;
import chess.queries.BlackPawnMovesMatcher;
import chess.queries.KingMovesMatch;
import chess.queries.KingMovesMatcher;
import chess.queries.QueenMovesMatch;
import chess.queries.QueenMovesMatcher;
import chess.queries.RookMovesMatch;
import chess.queries.RookMovesMatcher;
import chess.queries.WhiteKnightMovesMatch;
import chess.queries.WhiteKnightMovesMatcher;
import chess.queries.WhitePawnMovesMatch;
import chess.queries.WhitePawnMovesMatcher;
import chessdiagram.Bishop;
import chessdiagram.Chess;
import chessdiagram.ChessdiagramFactory;
import chessdiagram.Colour;
import chessdiagram.King;
import chessdiagram.Knight;
import chessdiagram.Pawn;
import chessdiagram.Piece;
import chessdiagram.PieceType;
import chessdiagram.Player;
import chessdiagram.Queen;
import chessdiagram.Rook;
import chessdiagram.Square;
import chessdiagram.generator.BoardVisualizer;
import com.google.common.base.Objects;
import dse.ChessEngine;
import java.util.Random;
import model.transformation.BishopMovesRule;
import model.transformation.BlackKnightRule;
import model.transformation.BlackPawnMovesRule;
import model.transformation.KingMovesRule;
import model.transformation.QueenMovesRule;
import model.transformation.RookMovesRule;
import model.transformation.WhiteKnightRule;
import model.transformation.WhitePawnMovesRule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.transformation.evm.api.RuleEngine;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation;
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class ModelTransformation {
  /**
   * Transformation-related extensions
   */
  @Extension
  private BatchTransformation transformation;
  
  @Extension
  private BatchTransformationStatements statements;
  
  /**
   * Transformation rule-related extensions
   */
  @Extension
  private IModelManipulations manipulation;
  
  protected ViatraQueryEngine engine;
  
  protected Resource resource;
  
  protected Square clickedSquare;
  
  protected Chess chess;
  
  protected ChessdiagramFactory factory;
  
  protected BoardVisualizer visualizer;
  
  /**
   * Coloring the possible move squares
   */
  private final DSETransformationRule<WhitePawnMovesMatch, WhitePawnMovesMatcher> whitePawnMovesColourRule = new Function0<DSETransformationRule<WhitePawnMovesMatch, WhitePawnMovesMatcher>>() {
    public DSETransformationRule<WhitePawnMovesMatch, WhitePawnMovesMatcher> apply() {
      try {
        DSETransformationRule<WhitePawnMovesMatch, WhitePawnMovesMatcher> _whitePawnMovesColourRule = WhitePawnMovesRule.getWhitePawnMovesColourRule(ModelTransformation.this.chess);
        return _whitePawnMovesColourRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private final DSETransformationRule<BlackPawnMovesMatch, BlackPawnMovesMatcher> blackPawnMovesColourRule = new Function0<DSETransformationRule<BlackPawnMovesMatch, BlackPawnMovesMatcher>>() {
    public DSETransformationRule<BlackPawnMovesMatch, BlackPawnMovesMatcher> apply() {
      try {
        DSETransformationRule<BlackPawnMovesMatch, BlackPawnMovesMatcher> _blackPawnMovesColourRule = BlackPawnMovesRule.getBlackPawnMovesColourRule();
        return _blackPawnMovesColourRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private final DSETransformationRule<RookMovesMatch, RookMovesMatcher> rookMovesColourRule = new Function0<DSETransformationRule<RookMovesMatch, RookMovesMatcher>>() {
    public DSETransformationRule<RookMovesMatch, RookMovesMatcher> apply() {
      try {
        DSETransformationRule<RookMovesMatch, RookMovesMatcher> _rookMovesColourRule = RookMovesRule.getRookMovesColourRule();
        return _rookMovesColourRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private final DSETransformationRule<WhiteKnightMovesMatch, WhiteKnightMovesMatcher> whiteKnightMovesColourRule = new Function0<DSETransformationRule<WhiteKnightMovesMatch, WhiteKnightMovesMatcher>>() {
    public DSETransformationRule<WhiteKnightMovesMatch, WhiteKnightMovesMatcher> apply() {
      try {
        DSETransformationRule<WhiteKnightMovesMatch, WhiteKnightMovesMatcher> _whiteKnightsColourRule = WhiteKnightRule.getWhiteKnightsColourRule();
        return _whiteKnightsColourRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private final DSETransformationRule<BlackKnightMovesMatch, BlackKnightMovesMatcher> blackKnightMovesColourRule = new Function0<DSETransformationRule<BlackKnightMovesMatch, BlackKnightMovesMatcher>>() {
    public DSETransformationRule<BlackKnightMovesMatch, BlackKnightMovesMatcher> apply() {
      try {
        DSETransformationRule<BlackKnightMovesMatch, BlackKnightMovesMatcher> _blackKnightsColourRule = BlackKnightRule.getBlackKnightsColourRule();
        return _blackKnightsColourRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private final DSETransformationRule<BishopMovesMatch, BishopMovesMatcher> bishopMovesColourRule = new Function0<DSETransformationRule<BishopMovesMatch, BishopMovesMatcher>>() {
    public DSETransformationRule<BishopMovesMatch, BishopMovesMatcher> apply() {
      try {
        DSETransformationRule<BishopMovesMatch, BishopMovesMatcher> _bishopMovesColourRule = BishopMovesRule.getBishopMovesColourRule();
        return _bishopMovesColourRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private final DSETransformationRule<QueenMovesMatch, QueenMovesMatcher> queenMovesColourRule = new Function0<DSETransformationRule<QueenMovesMatch, QueenMovesMatcher>>() {
    public DSETransformationRule<QueenMovesMatch, QueenMovesMatcher> apply() {
      try {
        DSETransformationRule<QueenMovesMatch, QueenMovesMatcher> _queenMovesColourRule = QueenMovesRule.getQueenMovesColourRule();
        return _queenMovesColourRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private final DSETransformationRule<KingMovesMatch, KingMovesMatcher> kingMovesColourRule = new Function0<DSETransformationRule<KingMovesMatch, KingMovesMatcher>>() {
    public DSETransformationRule<KingMovesMatch, KingMovesMatcher> apply() {
      try {
        DSETransformationRule<KingMovesMatch, KingMovesMatcher> _kingMovesColourRule = KingMovesRule.getKingMovesColourRule();
        return _kingMovesColourRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  /**
   * Moving the pieces
   */
  private DSETransformationRule<WhitePawnMovesMatch, WhitePawnMovesMatcher> whitePawnMovesRule = new Function0<DSETransformationRule<WhitePawnMovesMatch, WhitePawnMovesMatcher>>() {
    public DSETransformationRule<WhitePawnMovesMatch, WhitePawnMovesMatcher> apply() {
      try {
        DSETransformationRule<WhitePawnMovesMatch, WhitePawnMovesMatcher> _whitePawnMovesRule = WhitePawnMovesRule.getWhitePawnMovesRule();
        return _whitePawnMovesRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private DSETransformationRule<BlackPawnMovesMatch, BlackPawnMovesMatcher> blackPawnMovesRule = new Function0<DSETransformationRule<BlackPawnMovesMatch, BlackPawnMovesMatcher>>() {
    public DSETransformationRule<BlackPawnMovesMatch, BlackPawnMovesMatcher> apply() {
      try {
        DSETransformationRule<BlackPawnMovesMatch, BlackPawnMovesMatcher> _blackPawnMovesRule = BlackPawnMovesRule.getBlackPawnMovesRule();
        return _blackPawnMovesRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private DSETransformationRule<RookMovesMatch, RookMovesMatcher> rookMovesRule = new Function0<DSETransformationRule<RookMovesMatch, RookMovesMatcher>>() {
    public DSETransformationRule<RookMovesMatch, RookMovesMatcher> apply() {
      try {
        DSETransformationRule<RookMovesMatch, RookMovesMatcher> _rookMovesRule = RookMovesRule.getRookMovesRule();
        return _rookMovesRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private DSETransformationRule<WhiteKnightMovesMatch, WhiteKnightMovesMatcher> whiteKnightMovesRule = new Function0<DSETransformationRule<WhiteKnightMovesMatch, WhiteKnightMovesMatcher>>() {
    public DSETransformationRule<WhiteKnightMovesMatch, WhiteKnightMovesMatcher> apply() {
      try {
        DSETransformationRule<WhiteKnightMovesMatch, WhiteKnightMovesMatcher> _whiteKnightMovesRule = WhiteKnightRule.getWhiteKnightMovesRule();
        return _whiteKnightMovesRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private DSETransformationRule<BlackKnightMovesMatch, BlackKnightMovesMatcher> blackKnightMovesRule = new Function0<DSETransformationRule<BlackKnightMovesMatch, BlackKnightMovesMatcher>>() {
    public DSETransformationRule<BlackKnightMovesMatch, BlackKnightMovesMatcher> apply() {
      try {
        DSETransformationRule<BlackKnightMovesMatch, BlackKnightMovesMatcher> _blackKnightMovesRule = BlackKnightRule.getBlackKnightMovesRule();
        return _blackKnightMovesRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private DSETransformationRule<BishopMovesMatch, BishopMovesMatcher> bishopMovesRule = new Function0<DSETransformationRule<BishopMovesMatch, BishopMovesMatcher>>() {
    public DSETransformationRule<BishopMovesMatch, BishopMovesMatcher> apply() {
      try {
        DSETransformationRule<BishopMovesMatch, BishopMovesMatcher> _bishopMovesRule = BishopMovesRule.getBishopMovesRule();
        return _bishopMovesRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private DSETransformationRule<QueenMovesMatch, QueenMovesMatcher> queenMovesRule = new Function0<DSETransformationRule<QueenMovesMatch, QueenMovesMatcher>>() {
    public DSETransformationRule<QueenMovesMatch, QueenMovesMatcher> apply() {
      try {
        DSETransformationRule<QueenMovesMatch, QueenMovesMatcher> _queenMovesRule = QueenMovesRule.getQueenMovesRule();
        return _queenMovesRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private DSETransformationRule<KingMovesMatch, KingMovesMatcher> kingMovesRule = new Function0<DSETransformationRule<KingMovesMatch, KingMovesMatcher>>() {
    public DSETransformationRule<KingMovesMatch, KingMovesMatcher> apply() {
      try {
        DSETransformationRule<KingMovesMatch, KingMovesMatcher> _kingMovesRule = KingMovesRule.getKingMovesRule();
        return _kingMovesRule;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  public String colourWhitePieceMoves(final Piece p) {
    String _switchResult = null;
    PieceType _pieceType = p.getPieceType();
    if (_pieceType != null) {
      switch (_pieceType) {
        case PAWN:
          Pair<String, Object> _pair = new Pair<String, Object>("piece", p);
          this.statements.<WhitePawnMovesMatch>fireAllCurrent(this.whitePawnMovesColourRule, _pair);
          break;
        case ROOK:
          Pair<String, Object> _pair_1 = new Pair<String, Object>("rook", p);
          this.statements.<RookMovesMatch>fireAllCurrent(this.rookMovesColourRule, _pair_1);
          break;
        case KNIGHT:
          Pair<String, Object> _pair_2 = new Pair<String, Object>("piece", p);
          this.statements.<WhiteKnightMovesMatch>fireAllCurrent(this.whiteKnightMovesColourRule, _pair_2);
          break;
        case BISHOP:
          Pair<String, Object> _pair_3 = new Pair<String, Object>("piece", p);
          this.statements.<BishopMovesMatch>fireAllCurrent(this.bishopMovesColourRule, _pair_3);
          break;
        case QUEEN:
          Pair<String, Object> _pair_4 = new Pair<String, Object>("queen", p);
          this.statements.<QueenMovesMatch>fireAllCurrent(this.queenMovesColourRule, _pair_4);
          break;
        case KING:
          Pair<String, Object> _pair_5 = new Pair<String, Object>("king", p);
          this.statements.<KingMovesMatch>fireAllCurrent(this.kingMovesColourRule, _pair_5);
          break;
        default:
          _switchResult = InputOutput.<String>println("Error");
          break;
      }
    } else {
      _switchResult = InputOutput.<String>println("Error");
    }
    return _switchResult;
  }
  
  public String colourBlackPieceMoves(final Piece p) {
    String _switchResult = null;
    PieceType _pieceType = p.getPieceType();
    if (_pieceType != null) {
      switch (_pieceType) {
        case PAWN:
          Pair<String, Object> _pair = new Pair<String, Object>("piece", p);
          this.statements.<BlackPawnMovesMatch>fireAllCurrent(this.blackPawnMovesColourRule, _pair);
          break;
        case ROOK:
          Pair<String, Object> _pair_1 = new Pair<String, Object>("rook", p);
          this.statements.<RookMovesMatch>fireAllCurrent(this.rookMovesColourRule, _pair_1);
          break;
        case KNIGHT:
          Pair<String, Object> _pair_2 = new Pair<String, Object>("piece", p);
          this.statements.<BlackKnightMovesMatch>fireAllCurrent(this.blackKnightMovesColourRule, _pair_2);
          break;
        case BISHOP:
          Pair<String, Object> _pair_3 = new Pair<String, Object>("piece", p);
          this.statements.<BishopMovesMatch>fireAllCurrent(this.bishopMovesColourRule, _pair_3);
          break;
        case QUEEN:
          Pair<String, Object> _pair_4 = new Pair<String, Object>("queen", p);
          this.statements.<QueenMovesMatch>fireAllCurrent(this.queenMovesColourRule, _pair_4);
          break;
        case KING:
          Pair<String, Object> _pair_5 = new Pair<String, Object>("king", p);
          this.statements.<KingMovesMatch>fireAllCurrent(this.kingMovesColourRule, _pair_5);
          break;
        default:
          _switchResult = InputOutput.<String>println("Error");
          break;
      }
    } else {
      _switchResult = InputOutput.<String>println("Error");
    }
    return _switchResult;
  }
  
  public String colourSquare(final Square clickedSquare, final Square square) {
    String _switchResult = null;
    Piece _piece = square.getPiece();
    Colour _colour = _piece.getColour();
    if (_colour != null) {
      switch (_colour) {
        case WHITE:
          String _xifexpression = null;
          boolean _isWhitePlayerTurn = this.chess.isWhitePlayerTurn();
          if (_isWhitePlayerTurn) {
            Piece _piece_1 = square.getPiece();
            _xifexpression = this.colourWhitePieceMoves(_piece_1);
          }
          _switchResult = _xifexpression;
          break;
        case BLACK:
          String _xifexpression_1 = null;
          boolean _isWhitePlayerTurn_1 = this.chess.isWhitePlayerTurn();
          boolean _not = (!_isWhitePlayerTurn_1);
          if (_not) {
            Piece _piece_2 = square.getPiece();
            _xifexpression_1 = this.colourBlackPieceMoves(_piece_2);
          }
          _switchResult = _xifexpression_1;
          break;
        default:
          _switchResult = InputOutput.<String>println("Error: The selected square colour doesn\'t exist");
          break;
      }
    } else {
      _switchResult = InputOutput.<String>println("Error: The selected square colour doesn\'t exist");
    }
    return _switchResult;
  }
  
  public String moveWhitePiece(final Square destinationSquare) {
    String _xblockexpression = null;
    {
      final Piece p = this.clickedSquare.getPiece();
      String _switchResult = null;
      PieceType _pieceType = p.getPieceType();
      if (_pieceType != null) {
        switch (_pieceType) {
          case PAWN:
            Pair<String, Object> _pair = new Pair<String, Object>("piece", p);
            Pair<String, Object> _pair_1 = new Pair<String, Object>("square", destinationSquare);
            this.statements.<WhitePawnMovesMatch>fireAllCurrent(this.whitePawnMovesRule, _pair, _pair_1);
            break;
          case ROOK:
            Pair<String, Object> _pair_2 = new Pair<String, Object>("rook", p);
            Pair<String, Object> _pair_3 = new Pair<String, Object>("square", destinationSquare);
            this.statements.<RookMovesMatch>fireAllCurrent(this.rookMovesRule, _pair_2, _pair_3);
            break;
          case KNIGHT:
            Pair<String, Object> _pair_4 = new Pair<String, Object>("piece", p);
            Pair<String, Object> _pair_5 = new Pair<String, Object>("square", destinationSquare);
            this.statements.<WhiteKnightMovesMatch>fireAllCurrent(this.whiteKnightMovesRule, _pair_4, _pair_5);
            break;
          case BISHOP:
            Pair<String, Object> _pair_6 = new Pair<String, Object>("piece", p);
            Pair<String, Object> _pair_7 = new Pair<String, Object>("square", destinationSquare);
            this.statements.<BishopMovesMatch>fireAllCurrent(this.bishopMovesRule, _pair_6, _pair_7);
            break;
          case QUEEN:
            Pair<String, Object> _pair_8 = new Pair<String, Object>("queen", p);
            Pair<String, Object> _pair_9 = new Pair<String, Object>("square", destinationSquare);
            this.statements.<QueenMovesMatch>fireAllCurrent(this.queenMovesRule, _pair_8, _pair_9);
            break;
          case KING:
            Pair<String, Object> _pair_10 = new Pair<String, Object>("king", p);
            Pair<String, Object> _pair_11 = new Pair<String, Object>("square", destinationSquare);
            this.statements.<KingMovesMatch>fireAllCurrent(this.kingMovesRule, _pair_10, _pair_11);
            break;
          default:
            _switchResult = InputOutput.<String>println("Error");
            break;
        }
      } else {
        _switchResult = InputOutput.<String>println("Error");
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public String moveBlackPiece(final Square destinationSquare) {
    String _xblockexpression = null;
    {
      final Piece p = this.clickedSquare.getPiece();
      String _switchResult = null;
      PieceType _pieceType = p.getPieceType();
      if (_pieceType != null) {
        switch (_pieceType) {
          case PAWN:
            Pair<String, Object> _pair = new Pair<String, Object>("piece", p);
            Pair<String, Object> _pair_1 = new Pair<String, Object>("square", destinationSquare);
            this.statements.<BlackPawnMovesMatch>fireAllCurrent(this.blackPawnMovesRule, _pair, _pair_1);
            break;
          case ROOK:
            Pair<String, Object> _pair_2 = new Pair<String, Object>("rook", p);
            Pair<String, Object> _pair_3 = new Pair<String, Object>("square", destinationSquare);
            this.statements.<RookMovesMatch>fireAllCurrent(this.rookMovesRule, _pair_2, _pair_3);
            break;
          case KNIGHT:
            Pair<String, Object> _pair_4 = new Pair<String, Object>("piece", p);
            Pair<String, Object> _pair_5 = new Pair<String, Object>("square", destinationSquare);
            this.statements.<BlackKnightMovesMatch>fireAllCurrent(this.blackKnightMovesRule, _pair_4, _pair_5);
            break;
          case BISHOP:
            Pair<String, Object> _pair_6 = new Pair<String, Object>("bishop", p);
            Pair<String, Object> _pair_7 = new Pair<String, Object>("square", destinationSquare);
            this.statements.<BishopMovesMatch>fireAllCurrent(this.bishopMovesRule, _pair_6, _pair_7);
            break;
          case QUEEN:
            Pair<String, Object> _pair_8 = new Pair<String, Object>("queen", p);
            Pair<String, Object> _pair_9 = new Pair<String, Object>("square", destinationSquare);
            this.statements.<QueenMovesMatch>fireAllCurrent(this.queenMovesRule, _pair_8, _pair_9);
            break;
          case KING:
            Pair<String, Object> _pair_10 = new Pair<String, Object>("king", p);
            Pair<String, Object> _pair_11 = new Pair<String, Object>("square", destinationSquare);
            this.statements.<KingMovesMatch>fireAllCurrent(this.kingMovesRule, _pair_10, _pair_11);
            break;
          default:
            _switchResult = InputOutput.<String>println("Error");
            break;
        }
      } else {
        _switchResult = InputOutput.<String>println("Error");
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public String moveBlackPieceRandomly(final Piece p) {
    try {
      String _switchResult = null;
      PieceType _pieceType = p.getPieceType();
      if (_pieceType != null) {
        switch (_pieceType) {
          case PAWN:
            Pawn pawn = ((Pawn) p);
            BlackPawnMovesMatcher matcher = BlackPawnMovesMatcher.on(this.engine);
            final BlackPawnMovesMatch match = matcher.getOneArbitraryMatch(pawn, null, null);
            boolean _notEquals = (!Objects.equal(match, null));
            if (_notEquals) {
              Pair<String, Object> _pair = new Pair<String, Object>("piece", p);
              Square _square = match.getSquare();
              Pair<String, Object> _pair_1 = new Pair<String, Object>("square", _square);
              this.statements.<BlackPawnMovesMatch>fireOne(this.blackPawnMovesRule, _pair, _pair_1);
            }
            break;
          case ROOK:
            Rook rook = ((Rook) p);
            RookMovesMatcher matcher_1 = RookMovesMatcher.on(this.engine);
            final RookMovesMatch match_1 = matcher_1.getOneArbitraryMatch(rook, null, null);
            boolean _notEquals_1 = (!Objects.equal(match_1, null));
            if (_notEquals_1) {
              Pair<String, Object> _pair_2 = new Pair<String, Object>("rook", rook);
              Square _square_1 = match_1.getSquare();
              Pair<String, Object> _pair_3 = new Pair<String, Object>("square", _square_1);
              this.statements.<RookMovesMatch>fireOne(this.rookMovesRule, _pair_2, _pair_3);
            }
            break;
          case KNIGHT:
            Knight knight = ((Knight) p);
            BlackKnightMovesMatcher matcher_2 = BlackKnightMovesMatcher.on(this.engine);
            BlackKnightMovesMatch match_2 = matcher_2.getOneArbitraryMatch(knight, null, null);
            boolean _notEquals_2 = (!Objects.equal(match_2, null));
            if (_notEquals_2) {
              Pair<String, Object> _pair_4 = new Pair<String, Object>("piece", knight);
              Square _square_2 = match_2.getSquare();
              Pair<String, Object> _pair_5 = new Pair<String, Object>("square", _square_2);
              this.statements.<BlackKnightMovesMatch>fireOne(this.blackKnightMovesRule, _pair_4, _pair_5);
            }
            break;
          case BISHOP:
            Bishop bishop = ((Bishop) p);
            BishopMovesMatcher matcher_3 = BishopMovesMatcher.on(this.engine);
            BishopMovesMatch match_3 = matcher_3.getOneArbitraryMatch(bishop, null, null);
            boolean _notEquals_3 = (!Objects.equal(match_3, null));
            if (_notEquals_3) {
              Pair<String, Object> _pair_6 = new Pair<String, Object>("piece", bishop);
              Square _square_3 = match_3.getSquare();
              Pair<String, Object> _pair_7 = new Pair<String, Object>("square", _square_3);
              this.statements.<BishopMovesMatch>fireOne(this.bishopMovesRule, _pair_6, _pair_7);
            }
            break;
          case QUEEN:
            Queen queen = ((Queen) p);
            QueenMovesMatcher matcher_4 = QueenMovesMatcher.on(this.engine);
            QueenMovesMatch match_4 = matcher_4.getOneArbitraryMatch(queen, null, null);
            boolean _notEquals_4 = (!Objects.equal(match_4, null));
            if (_notEquals_4) {
              Pair<String, Object> _pair_8 = new Pair<String, Object>("queen", queen);
              Square _square_4 = match_4.getSquare();
              Pair<String, Object> _pair_9 = new Pair<String, Object>("square", _square_4);
              this.statements.<QueenMovesMatch>fireOne(this.queenMovesRule, _pair_8, _pair_9);
            }
            break;
          case KING:
            King king = ((King) p);
            KingMovesMatcher matcher_5 = KingMovesMatcher.on(this.engine);
            KingMovesMatch match_5 = matcher_5.getOneArbitraryMatch(king, null, null);
            boolean _notEquals_5 = (!Objects.equal(match_5, null));
            if (_notEquals_5) {
              Pair<String, Object> _pair_10 = new Pair<String, Object>("king", king);
              Square _square_5 = match_5.getSquare();
              Pair<String, Object> _pair_11 = new Pair<String, Object>("square", _square_5);
              this.statements.<KingMovesMatch>fireOne(this.kingMovesRule, _pair_10, _pair_11);
            }
            break;
          default:
            _switchResult = InputOutput.<String>println("Error");
            break;
        }
      } else {
        _switchResult = InputOutput.<String>println("Error");
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String movePiece(final Square destinationSquare) {
    String _switchResult = null;
    Piece _piece = this.clickedSquare.getPiece();
    Colour _colour = _piece.getColour();
    if (_colour != null) {
      switch (_colour) {
        case WHITE:
          String _xifexpression = null;
          boolean _isWhitePlayerTurn = this.chess.isWhitePlayerTurn();
          if (_isWhitePlayerTurn) {
            _xifexpression = this.moveWhitePiece(destinationSquare);
          }
          _switchResult = _xifexpression;
          break;
        case BLACK:
          Object _xifexpression_1 = null;
          boolean _isWhitePlayerTurn_1 = this.chess.isWhitePlayerTurn();
          boolean _not = (!_isWhitePlayerTurn_1);
          if (_not) {
            _xifexpression_1 = null;
          }
          _switchResult = ((String)_xifexpression_1);
          break;
        default:
          _switchResult = null;
          break;
      }
    } else {
      _switchResult = null;
    }
    return _switchResult;
  }
  
  public ModelTransformation(final Resource resource) {
    try {
      this.resource = resource;
      final EMFScope scope = new EMFScope(resource);
      ViatraQueryEngine _on = ViatraQueryEngine.on(scope);
      this.engine = _on;
      this.clickedSquare = null;
      this.createTransformation();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public ModelTransformation(final Resource resource, final Chess chess, final BoardVisualizer visualizer) {
    try {
      this.resource = resource;
      final EMFScope scope = new EMFScope(resource);
      ViatraQueryEngine _on = ViatraQueryEngine.on(scope);
      this.engine = _on;
      this.clickedSquare = null;
      this.chess = chess;
      this.visualizer = visualizer;
      this.createTransformation();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void moveBlackPlayer() {
    try {
      ChessEngine dse = new ChessEngine(this.chess, this);
      dse.startExploaring();
      boolean _solutionsIsEmpty = dse.solutionsIsEmpty();
      boolean _not = (!_solutionsIsEmpty);
      if (_not) {
        dse.doNextStep();
      } else {
        InputOutput.<String>println("Random move");
        while (((!this.chess.isWhitePlayerTurn()) && (!Objects.equal(this.chess.getBlackPlayer().getPiece(), null)))) {
          {
            Random rand = new Random();
            Player _blackPlayer = this.chess.getBlackPlayer();
            EList<Piece> _piece = _blackPlayer.getPiece();
            int _size = _piece.size();
            int index = rand.nextInt(_size);
            Player _blackPlayer_1 = this.chess.getBlackPlayer();
            EList<Piece> _piece_1 = _blackPlayer_1.getPiece();
            Piece piece = _piece_1.get(index);
            this.moveBlackPieceRandomly(piece);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Square execute(final Square square, final BoardVisualizer vis) {
    Square _xifexpression = null;
    boolean _equals = Objects.equal(this.clickedSquare, null);
    if (_equals) {
      Square _xifexpression_1 = null;
      Piece _piece = square.getPiece();
      boolean _notEquals = (!Objects.equal(_piece, null));
      if (_notEquals) {
        Square _xifexpression_2 = null;
        Piece _piece_1 = square.getPiece();
        boolean _notEquals_1 = (!Objects.equal(_piece_1, null));
        if (_notEquals_1) {
          Square _xblockexpression = null;
          {
            this.colourSquare(this.clickedSquare, square);
            _xblockexpression = this.clickedSquare = square;
          }
          _xifexpression_2 = _xblockexpression;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    } else {
      Square _xblockexpression_1 = null;
      {
        boolean _isWhitePlayerTurn = this.chess.isWhitePlayerTurn();
        if (_isWhitePlayerTurn) {
          this.movePiece(square);
        }
        Square _xifexpression_3 = null;
        boolean _isWhitePlayerTurn_1 = this.chess.isWhitePlayerTurn();
        boolean _not = (!_isWhitePlayerTurn_1);
        if (_not) {
          this.clickedSquare = null;
          this.moveBlackPlayer();
        } else {
          Square _xifexpression_4 = null;
          Piece _piece_2 = square.getPiece();
          boolean _notEquals_2 = (!Objects.equal(_piece_2, null));
          if (_notEquals_2) {
            Square _xblockexpression_2 = null;
            {
              this.colourSquare(this.clickedSquare, square);
              _xblockexpression_2 = this.clickedSquare = square;
            }
            _xifexpression_4 = _xblockexpression_2;
          }
          _xifexpression_3 = _xifexpression_4;
        }
        _xblockexpression_1 = _xifexpression_3;
      }
      _xifexpression = _xblockexpression_1;
    }
    return _xifexpression;
  }
  
  private BatchTransformationStatements createTransformation() {
    try {
      BatchTransformationStatements _xblockexpression = null;
      {
        SimpleModelManipulations _simpleModelManipulations = new SimpleModelManipulations(this.engine);
        this.manipulation = _simpleModelManipulations;
        BatchTransformation.BatchTransformationBuilder _forEngine = BatchTransformation.forEngine(this.engine);
        BatchTransformation _build = _forEngine.build();
        this.transformation = _build;
        BatchTransformationStatements _transformationStatements = this.transformation.getTransformationStatements();
        _xblockexpression = this.statements = _transformationStatements;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void dispose() {
    boolean _notEquals = (!Objects.equal(this.transformation, null));
    if (_notEquals) {
      RuleEngine _ruleEngine = this.transformation.getRuleEngine();
      _ruleEngine.dispose();
    }
    this.transformation = null;
    return;
  }
}
