package Question9;
import java.awt.Graphics; 
import java.awt.Graphics2D;
import java.awt.geom.*;

import javax.swing.JFrame; 
import javax.swing.JComponent; 

import Question7.Door;
/**
 * This program uses the standard graphics library provided in Java to draw a house
 * 
 * @version 0.1
 * @author Anthony Chao
 *
 */

public class Number1 
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
		// draw the triangle
		g2.draw(new Line2D.Double(125, 20, 175, 80));
		g2.draw(new Line2D.Double(125, 20, 75, 80));
		g2.draw(new Line2D.Double(75, 80, 175, 80));
		
		// draw the walls of the house
		g2.drawRect(75, 80, 100, 100);
		
		// draw the two windows of the house
		g2.drawRect(90, 100, 25, 25);
		g2.drawRect(135, 100, 25, 25);
		
		Door frontDoor = new Door("front", "open");
		
		if (frontDoor.isOpen()) {
			g2.fillRect(113, 140, 25, 40);
		} else {
			g2.drawRect(113, 140, 25, 40);
		}
		
		
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
