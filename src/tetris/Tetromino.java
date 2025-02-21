package tetris;
import java.awt.Color;
import java.awt.Point;


public class Tetromino {
	private Point[] shape;
	private Color color;
	
	public Tetromino(Point[] shape, Color color) {
		this.shape = shape;
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Point[] getPoint() {
		return shape;
	}
	public void setPoint(Point[] shape) {
		this.shape = shape;
	}
	public void rotate() {
		
	}
}
