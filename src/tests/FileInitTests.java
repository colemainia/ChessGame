package tests;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ChessBoard.*;

public class FileInitTests {
	private static ChessBoard chessBoard;
	@BeforeClass
	public static void setUp() {
		chessBoard = ChessBoard.getBoard();
		chessBoard.initialize();
		chessBoard.setBoard("src/data/standardbd.txt");
	}
	@Test
	public void pieceLocations() {
		BoardSquare square = chessBoard.getSquareAt(7,4);
		assertEquals(square.getRow(), 7);
		assertEquals(square.getColumn(), 4);
		assertEquals(ChessPiece.King, square.getPiece());
		assertEquals(PieceColor.White, square.getColorOfPiece());
		
		square = chessBoard.getSquareAt(3, 4);
		assertEquals(square.getRow(), 3);
		assertEquals(square.getColumn(), 4);
		assertEquals(ChessPiece.None, square.getPiece());
		assertEquals(PieceColor.None, square.getColorOfPiece());
		
		square = chessBoard.getSquareAt(1,  1);
		assertEquals(ChessPiece.Pawn, square.getPiece());
		assertEquals(PieceColor.Black, square.getColorOfPiece());
	}

}
