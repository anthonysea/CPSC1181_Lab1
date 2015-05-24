package Question7;
import java.awt.Rectangle;
/**
 * Door class with basic properties such as name and state
 * @version 0.1
 * @author Anthony Chao
 * 
 *
 */
public class Door extends Rectangle {
	
	private String name;
	private String state;
	
	
	// state mutator method
	public void open() {
		state = "open";
	}
	// state mutator method
	public void close() {
		state = "close";
	}
	
	public String getName() {
		return name;
	}
	
	public String getState() {
		return state;
	}
	
	// name mutator method
	/**
	 * Sets the instance variable name to newName
	 * @param newName The new name that will be set
	 */
	public void setName(String newName) {
		name = newName;
	}
	/**
	 * Checks to see if door is open or closed
	 * @return true; when state = "open"<br/>false; when state = "closed"
	 */
	public boolean isOpen() {
		if (state.charAt(0) == 'o') {
			return true;
		}
		return false;
	}
	
	
	// class constructor
	public Door(String initName, String initState) {
		name = initName;
		state = initState;
	}
}
