package Question6;
import java.awt.Graphics; 
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.JFrame; 
import javax.swing.JComponent; 
/**
 * This program uses the standard graphics library provided in Java to draw a triangle
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
		g2.draw(new Line2D.Double(125, 20, 175, 180));
		g2.draw(new Line2D.Double(125, 20, 75, 180));
		g2.draw(new Line2D.Double(75, 180, 175, 180));
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
