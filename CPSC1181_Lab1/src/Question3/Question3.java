package Question3;
/**
 * This program uses the String substring method and String concat to concatenate three separate strings
 *
 * 
 * @version 0.1
 * @author Anthony Chao
 *
 */
public class Question3 {
	public static void main(String[] args) {
		String message;
		String sentence1 = "      abc   "; 
	    String sentence2 = "   def"; 
	    String sentence3 = "ghi         ";      
	    message = sentence1.substring(6, 9) + sentence2.substring(3) + sentence3.substring(0, 3);
	    System.out.println(message);
	}
}
