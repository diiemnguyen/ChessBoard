import java.awt.Color;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.Random;

/**
    Test class for Chessboards and drawing Chessboard objects
    @author Jeff Smith
    @version for Assignment 7, CS 49J, SJSU, Fall 2013
 */

public class A7
{
   /**
        Constructs a random light color
        @param r a random object 
        @return the randomly constructed color
    */
   
   public static Color randomLightColor(Random r)  {
     return new Color(127+r.nextInt(127),
                      127+r.nextInt(127),
                      127+r.nextInt(127));         }

                      
   /**
        Constructs a random dark color
        @param r a random object 
        @return the randomly constructed color
    */
   
   public static Color randomDarkColor(Random r)  {
     return new Color(r.nextInt(128),
                      r.nextInt(128),
                      r.nextInt(128));        }

                      
       
   /**
        Tests the drawing of chessboards
        @param args is ignored
    */                   
   
   public static void main(String args[])                              {
     int frameWidth = 600;
     int frameHeight = 600;
     
     Board b1 = new Board(new Color(0,63,0), new Color(63,0,0));
     ArrayList<Piece> pieces = new ArrayList<Piece>();
     Chessboard chessboard1 = new Chessboard(b1, pieces);
     ChessboardComponent component1 = new ChessboardComponent(chessboard1);
     JFrame frame1 = new JFrame();
     frame1.setSize(frameWidth, frameHeight);
     frame1.add(component1);
     frame1.setTitle("$1");    
     frame1.setVisible(true);                      
     
     Board b2 = new Board(Color.GRAY, Color.BLUE);
     JFrame frame2 = new JFrame();
     frame2.setSize(frameWidth, frameHeight);
 /*    pieces.add(new King(Color.RED,5,8));
     pieces.add(new Bishop(Color.DARK_GRAY,3,1));
     pieces.add(new Knight(new Color(63,63,15),2,1));
     pieces.add(new Pawn(Color.RED,4,7));
     pieces.add(new Rook(new Color(255,255,127),1,1));
     pieces.add(new Queen(new Color(127,63,15),4,1));*/
     Chessboard chessboard2 = new Chessboard(b2, pieces);
     ChessboardComponent component2 = new ChessboardComponent(chessboard2);
     frame2.add(component2);
     frame2.setTitle("$2");    
     frame2.setVisible(true);   
     
     Board b3 = new Board(new Color(255,191,191), new Color(0,63,0));
     JFrame frame3 = new JFrame();
     frame3.setSize(frameWidth, frameHeight);
     Color whitesColor = new Color(127,127,255);
     Color blacksColor = new Color(63,63,127);
     pieces = new ArrayList<Piece>();
   /*  pieces.add(new Rook(whitesColor,1,1));
     pieces.add(new Rook(whitesColor,8,1));
     pieces.add(new Rook(blacksColor,1,8));                  
     pieces.add(new Rook(blacksColor,8,8));                  
     pieces.add(new Knight(whitesColor,2,1));
     pieces.add(new Knight(whitesColor,7,1));
     pieces.add(new Knight(blacksColor,2,8));                  
     pieces.add(new Knight(blacksColor,7,8));                  
     pieces.add(new Bishop(whitesColor,3,1));
     pieces.add(new Bishop(whitesColor,6,1));
     pieces.add(new Bishop(blacksColor,3,8));                  
     pieces.add(new Bishop(blacksColor,6,8));                  
     pieces.add(new Queen(whitesColor,4,1));
     pieces.add(new Queen(blacksColor,4,8));                  
     pieces.add(new King(whitesColor,5,1));
     pieces.add(new King(blacksColor,5,8));     */             
     for (int file=1; file<=8; file++)                            
     {
    	 //pieces.add(new Pawn(whitesColor,file,2));
    	 //pieces.add(new Pawn(blacksColor,file,7));                  
     }
     Chessboard chessboard3 = new Chessboard(b3, pieces);
     ChessboardComponent component3 = new ChessboardComponent(chessboard3);
     frame3.add(component3);
     frame3.setTitle("$3");    
     frame3.setVisible(true);     
     
     Random r = new Random(7);
     Board b4 = new Board(Color.WHITE, Color.BLACK);
     JFrame frame4 = new JFrame();
     frame4.setSize(frameWidth, frameHeight);
     pieces = new ArrayList<Piece>();
     /*pieces.add(new Rook(randomLightColor(r),1,1));
     pieces.add(new Rook(randomLightColor(r),1,2));
     pieces.add(new Rook(randomLightColor(r),8,1));
     pieces.add(new Rook(randomLightColor(r),8,2));
     pieces.add(new Rook(randomDarkColor(r),1,8));                  
     pieces.add(new Rook(randomDarkColor(r),1,7));                  
     pieces.add(new Rook(randomDarkColor(r),8,8));                  
     pieces.add(new Rook(randomDarkColor(r),8,7));                  
     pieces.add(new Knight(randomLightColor(r),2,1));
     pieces.add(new Knight(randomLightColor(r),2,2));
     pieces.add(new Knight(randomLightColor(r),7,1));
     pieces.add(new Knight(randomLightColor(r),7,2));
     pieces.add(new Knight(randomDarkColor(r),2,8));                  
     pieces.add(new Knight(randomDarkColor(r),2,7));                  
     pieces.add(new Knight(randomDarkColor(r),7,8));                  
     pieces.add(new Knight(randomDarkColor(r),7,7));                  
     pieces.add(new Bishop(randomLightColor(r),3,1));
     pieces.add(new Bishop(randomLightColor(r),3,2));
     pieces.add(new Bishop(randomLightColor(r),6,1));
     pieces.add(new Bishop(randomLightColor(r),6,2));
     pieces.add(new Bishop(randomDarkColor(r),3,8));                  
     pieces.add(new Bishop(randomDarkColor(r),3,7));                  
     pieces.add(new Bishop(randomDarkColor(r),6,8));                  
     pieces.add(new Bishop(randomDarkColor(r),6,7));                  
     pieces.add(new Queen(randomLightColor(r),4,1));
     pieces.add(new Queen(randomLightColor(r),4,2));
     pieces.add(new Queen(randomDarkColor(r),4,8));                  
     pieces.add(new Queen(randomDarkColor(r),4,7));                  
     pieces.add(new King(randomLightColor(r),5,1));
     pieces.add(new King(randomLightColor(r),5,2));
     pieces.add(new King(randomDarkColor(r),5,8));                  
     pieces.add(new King(randomDarkColor(r),5,7));      */            
     for (int file=1; file<=8; file++)                     
       for (int rank=3; rank<=4; rank++)                                
       {
    	   //pieces.add(new Pawn(randomLightColor(r),file,rank));
    	   //pieces.add(new Pawn(randomDarkColor(r),file,rank+2));            
       }
     Chessboard chessboard4 = new Chessboard(b4, pieces);
     ChessboardComponent component4 = new ChessboardComponent(chessboard4);
     frame4.add(component4);
     frame4.setTitle("$4");    
     frame4.setVisible(true);                      
                                                                 }
       
     
}