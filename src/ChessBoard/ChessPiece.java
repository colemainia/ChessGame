package ChessBoard;

import java.util.Set;

interface ChessPiece {
	public void move();
	public Set<BoardSquare> controls();
}
