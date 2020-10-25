package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //O java por padr�o coloca como nulo, quando n�o colocamos essa linha;
	}

	protected Board getBoard() {
		return board;
	}

		
	
	
}
