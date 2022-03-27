package game;

public class Rook extends Piece {

	public Rook(boolean white)
	{
		super(white);
	}

	@Override
	public boolean canMove(Board board, Spot start, Spot end)
	{
		// we can't move the piece to a Spot that has a piece of the same color
		if (end.getPiece().isWhite() == this.isWhite()) {
			return false;
		}

		int x = Math.abs(start.getX() - end.getX());
		int y = Math.abs(start.getY() - end.getY());
		return x * y == 2;   //???????
	}

	
}
