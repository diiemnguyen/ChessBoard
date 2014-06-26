import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Rectangle;

/**
    A graphics component for drawing Chessboard objects.
    @author Jeff Smith
    @version for Assignment 7, CS 49J, SJSU, Fall 2013
 */

public class ChessboardComponent extends JComponent
{
    
    // the chessboard to be drawn
    private Chessboard board; 

    
    /**
        Constructs a ChessboardComponent for a given chessboard
        @param b the chessboard to be drawn
     */
    public ChessboardComponent(Chessboard b)
    {
        board = b;
    }

    
    /**
         Draws the chessboard onto a specified Graphics object
         @param the Graphics object 
     */
    
   public void paintComponent(Graphics g)                    
   {
	   // size is the size of the largest square that fits  
	   int size = Math.min(getWidth(), getHeight());
	   Graphics2D g2 = (Graphics2D) g;
       board.draw(g2, 0, 0, size);                             
   }


}