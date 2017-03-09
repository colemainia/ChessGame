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
	public void setBoard(String FileName) {
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				chessBoard[i][j] = new BoardSquare(i, j, ChessPiece.None, PieceColor.None);
			}
		}
	}
	public Set<BoardSquare> getWhitePieces() {return whitePieces;}
	public Set<BoardSquare> getBlackPieces() {return blackPieces;}
	//May be useful? Don't know, but probably not going to be called anytime soon.
	public void ChangeSquare(int row, int column, ChessPiece chessPiece, PieceColor pieceColor) {
		chessBoard[row][column] = new BoardSquare(row, column, chessPiece, pieceColor);
	}
	public BoardSquare getSquareAt(int rank, int file) {return chessBoard[rank][file];}
}