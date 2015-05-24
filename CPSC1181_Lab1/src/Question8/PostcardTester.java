package Question8;
/**
 * Tests the Postcard class
 * @version 0.1
 * @author Anthony Chao
 *
 */
public class PostcardTester {
	public static void main(String[] args) {
		// example message
		String text = "I am having a great time on\nthe island of Java."
				+ " Weather\nis great. Wish you were here!";
		// initialization of a new Postcard object
		Postcard postcard = new Postcard("Janice", text);
		postcard.setRecipient("Sue");
		postcard.print();
		postcard.setRecipient("Tim");
		postcard.print();
	}
}
