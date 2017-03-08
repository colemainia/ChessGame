package ChessBoard;

public class BoardSquare {
	private static ChessPiece chessPiece;
	public static boolean isOccupied() {
		return (chessPiece != ChessPiece.None);
	}
	private OccupiedBy occupiedBy;
}
