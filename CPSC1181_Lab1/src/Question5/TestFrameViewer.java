package Question5;
import java.awt.Graphics; 
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.JFrame; 
import javax.swing.JComponent;
/**
 * This program is a template for making graphics using the standard libraries provided
 * in Java
 * 
 * @version 0.1
 * @author Anthony Chao
 *
 */
 
public class TestFrameViewer 
{ 
	/**
	 * Takes in a Graphics object and uses the Graphics2D library to cast it and
	 * will be used to draw a component
	 * @param g Graphics object to be drawn
	 * 
	 */
	public static void draw(Graphics g) 
   { 
	   Graphics2D g2 = (Graphics2D) g; 
	   // code here
   } 
   public static void main(String[] args) 
   { 
	   JFrame frame = new JFrame(); 
 
	   final int FRAME_WIDTH = 250; 
	   final int FRAME_HEIGHT = 250; 
	   
	   // sets the size of the frame using the variables declared above
	   frame.setSize(FRAME_WIDTH, FRAME_HEIGHT); 
	   frame.setTitle("A Test Frame"); 
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	   JComponent component = new JComponent() 
	   { 
		   public void paintComponent(Graphics graph) 
		   { 
			   draw(graph); 
		   } 
	   }; 
	   frame.add(component);
	   // allows the frame to be visible to the screen
	   frame.setVisible(true); 
   } 
 
}