package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece{

	private Color Color;

	public ChessPiece(Board board, Color color) {
		super(board);
		Color = color;
	}

	public Color getColor() {
		return Color;
	}
	
	
}
