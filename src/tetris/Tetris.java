package tetris;

public class Tetris {
	public static void main(String[] args) {
		GameController game = new GameController();
		System.out.println("Welcome to Tetris!");
		System.out.println("Initial score: " + game.currentScore());
		game.dropPiece();
		System.out.println("Current score: " + game.currentScore());
	}
}
