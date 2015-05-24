package Question8;
/**
 * Creates a Door class with instance variables: message, sender, recipient
 * @version 0.1
 * @author Anthony Chao
 *
 */
public class Postcard {
	private String message;
	private String sender;
	private String recipient;
	
	// constructor method
	/**
	 * 
	 * @param aSender Who the postcard is being sent from
	 * @param aMessage The message that is being sent
	 */
	public Postcard(String aSender, String aMessage) {
		message = aMessage;
		sender = aSender;
		recipient = "";
	}
	/**
	 * 
	 * @param aRecipient The recipient of the postcard
	 */
	public void setRecipient(String aRecipient) {
		recipient = aRecipient;
	}
	/**
	 * Outputs the postcard with all components concatenated
	 */
	public void print() {
		// concatenates the message, sender, and recipient 
		String output = "Dear, " + recipient + ": " + message + "\nFrom,\n" + sender;
		System.out.println(output);
	}
}
