package ChessBoard;

import java.util.HashSet;
import java.util.Set;

public class ChessBoard {
	public static final int BOARD_SIZE = 8;
	private static ChessBoard theBoard = new ChessBoard();
	private BoardSquare[][] chessBoard;
	private Set<BoardSquare> whitePieces;
	private Set<BoardSquare> blackPieces;
	public static ChessBoard getBoard() {return theBoard;}
	public void initialize() {
		chessBoard = new BoardSquare[BOARD_SIZE][BOARD_SIZE];
		whitePieces = new HashSet<BoardSquare>();
		blackPieces = new HashSet<BoardSquare>();
	}
	public void SetBoard(String FileName) {
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				chessBoard[i][j] = new BoardSquare(i, j, ChessPiece.None, OccupiedBy.None);
			}
		}
	}
	//May be useful? Don't know, but probably not going to be called anytime soon.
	public void ChangeSquare(int rank, int file, ChessPiece chessPiece, OccupiedBy occupiedBy) {
		chessBoard[rank][file] = new BoardSquare(rank, file, chessPiece, occupiedBy);
	}
	public BoardSquare getSquareAt(int rank, int file) {return chessBoard[rank][file];}
}