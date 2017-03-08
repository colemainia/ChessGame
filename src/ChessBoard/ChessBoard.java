package ChessBoard;

public class ChessBoard {
	public static final int BOARD_SIZE = 8;
	private static ChessBoard theBoard = new ChessBoard();
	private BoardSquare[][] chessBoard;
	public static ChessBoard getBoard() {
		return theBoard;
	}
	public void initialize() {
		chessBoard = new BoardSquare[BOARD_SIZE][BOARD_SIZE];
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				chessBoard[i][j] = new BoardSquare(i, j, ChessPiece.None, OccupiedBy.None);
			}
		}
	}
	public void SetBoard() {
		
	}
	public void ChangeSquare(int rank, int file, ChessPiece chessPiece, OccupiedBy occupiedBy) {
		
	}
	public BoardSquare getSquare(int rank, int file) {return chessBoard[rank][file];}
}