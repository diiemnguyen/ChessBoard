import java.awt.Color;
import java.awt.Graphics2D;

/**
    Instance of this class represent colored chess pieces on a chessboard
    @author Jeff Smith
    @version for Assignment 7, CS 49J, SJSU, Fall 2013
 */

public abstract class Piece
{
    private Color color;   // the color of the piece
    private int file;      // the file (column) where it appears on a chessboard
    private int rank;      // the rank (row) where it appears on a chessboard
    
    
   /**
        Constructs a piece of a given color at a given position
        @param color the color of the piece
        @param file the file (column) where it appears on a chessboard
        @param rank the rank (row) where it appears on a chessboard
    */    
    public Piece(Color color, int file, int rank)            
    {
    	this.file = file;
    	this.rank = rank;
    	this.color = color;                                    
    }
  
      
    /**
        Gets the file (column) where the piece is located
        @return the file (column) where the piece is located
     */

    public int getFile()      
    { 
        return file;            
    }
  
      
    /**
        Gets the rank (row) where the piece is located
        @return the rank (row) where the piece is located
     */

    public int getRank()      
    { 
        return rank;            
    }
  
      
    /**
        Gets the color of the piece
        @return the color of the piece
     */

    public Color getColor()   
    {
        return color;           
    }
      
      
   /**
       Draws the Piece onto a square to be shown on a given Graphics2D object
       @param g2 the Graphics2D object.
       @param x the x-coordinate of the upper-left corner of the square
       @param y the y-coordinate of the upper-left corner of the square
       @param size the size in pixels of the square
   */
     
    public abstract void draw(Graphics2D g2, int x, int y, int size);
    
}    