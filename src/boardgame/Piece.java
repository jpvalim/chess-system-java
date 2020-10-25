package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //O java por padrão coloca como nulo, quando não colocamos essa linha;
	}

	protected Board getBoard() {
		return board;
	}

		
	
	
}
