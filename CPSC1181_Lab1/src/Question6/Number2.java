package Question6;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Number2 {
	/**
	 * Takes in a Graphics object and uses the Graphics2D library to cast it and
	 * will be used to draw a component
	 * @param g Graphics object to be drawn
	 * 
	 */
	public static void draw(Graphics g) 
	   { 
		   Graphics2D g2 = (Graphics2D) g; 
		   // draw five circles that are fixed by the same tangent point
		   // uses the Ellipse2D.Double object to create the circles 
		   g2.draw(new Ellipse2D.Double(100, 160, 40, 40));
		   g2.draw(new Ellipse2D.Double(80, 120, 80, 80));
		   g2.draw(new Ellipse2D.Double(60, 80, 120, 120));
		   g2.draw(new Ellipse2D.Double(40, 40, 160, 160));
		   g2.draw(new Ellipse2D.Double(20, 0, 200, 200));
	   } 
	public static void main(String[] args) 
	   { 
		   JFrame frame = new JFrame(); 
	 
		   final int FRAME_WIDTH = 250; 
		   final int FRAME_HEIGHT = 250; 
	 
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
		   frame.setVisible(true); 
	   } 
}
