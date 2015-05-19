package Question2;
/**
 * This program uses the String concat method to concatenate some phrases into a sentence
 * 
 * @version 0.1
 * @author Anthony Chao
 *
 */
public class Question2 {
	public static void main(String[] args) {
		String message;
		String animal1 = "quick brown fox";
		String animal2 = "lazy dog";
		String article = "the";
		String action = "jumps over";
		message = article.concat(" ").concat(animal1).concat(" ").concat(action).concat(" ").concat(article).concat(" ").concat(animal2);
		System.out.println(message);
	}
}
