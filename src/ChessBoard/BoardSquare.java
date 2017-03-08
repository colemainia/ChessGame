package ChessBoard;

import java.util.HashSet;
import java.util.Set;

public class BoardSquare {
	// rank and file: locations of square on board
	private int rank;
	private int file;
	private Set<BoardSquare> controls;
	private Set<BoardSquare> moveChoices;
	private ChessPiece chessPiece;
	private OccupiedBy occupiedBy;
	public BoardSquare(int rank, int file, ChessPiece chessPiece, OccupiedBy occupiedBy) {
		this.rank = rank;
		this.file = file;
		this.chessPiece = chessPiece;
		this.occupiedBy = occupiedBy;
		controls = new HashSet<BoardSquare>();
		calcControls();
		moveChoices = new HashSet<BoardSquare>();
	}
	public boolean isOccupied() {
		return (occupiedBy != OccupiedBy.None);
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
	public int getRank() {return rank;}
	public int getFile() {return file;}
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
