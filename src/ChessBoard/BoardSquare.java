package ChessBoard;

import java.util.HashSet;
import java.util.Set;

public class BoardSquare {
	// rank and file: locations of square on board
	private int row;
	private int column;
	private Set<BoardSquare> controls;
	private Set<BoardSquare> moveChoices;
	private ChessPiece chessPiece;
	private PieceColor pieceColor;
	public BoardSquare(int row, int column, ChessPiece chessPiece, PieceColor pieceColor) {
		this.row = row;
		this.column = column;
		this.chessPiece = chessPiece;
		this.pieceColor = pieceColor;
		controls = new HashSet<BoardSquare>();
		calcControls();
		moveChoices = new HashSet<BoardSquare>();
	}
	public ChessPiece getPiece() {
		return chessPiece;
	}
	public PieceColor getColorOfPiece() {
		return pieceColor;
	}
	private void calcControls() {
		switch (chessPiece) {
		case Pawn:
			pawnControls();
			break;
		case King:
			kingControls();
			break;
		case Rook:
			rookControls();
			break;
		case Bishop:
			bishopControls();
			break;
		case Knight:
			knightControls();
			break;
		case Queen:
			queenControls();
			break;
		default:
			break;
		}
	}
	public int getRow() {return row;}
	public int getColumn() {return column;}
	public Set<BoardSquare> getControls() {return controls;}
	public Set<BoardSquare> getMoveChoices() {return moveChoices;}
	private void pawnControls() {
		
	}
	private void kingControls() {
		
	}
	private void rookControls() {
		
	}
	private void queenControls() {
		
	}
	private void knightControls() {
		
	}
	private void bishopControls() {
		
	}
}
