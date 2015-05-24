package Question4;
import java.awt.Rectangle;
/**
 * This program instantiates one Rectangle object having two variables reference it
 * 
 * @version 0.1
 * @author Anthony Chao
 *
 */

public class Number2 {
		public static void main(String[] args) 
		   { 
		      Rectangle r1 = new Rectangle(0, 0, 100, 50); 
		      Rectangle r2 = r1;
		      r2.grow(10,  20);
		      System.out.println(r1); 
		      System.out.println(r2);
		   } 
}