import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;


public class Chessboard {
	private Color color;
	private Color color2;
	
	public Chessboard(Board b1, ArrayList<Piece> pieces) 
	{
		b1 = new Board(color, color2);
		pieces = new ArrayList<Piece>();
	}

	public void draw(Graphics2D g2, int i, int j, int size) 
	{
		
		
	}
	
	
	
}
