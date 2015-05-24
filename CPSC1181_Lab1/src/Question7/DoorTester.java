package Question7;

public class DoorTester {
	/**
	 * Tests the methods of the Door class
	 * @param args not used
	 * 
	 */
	
	public static void main(String[] args) {
		Door frontDoor = new Door("Front", "open");
		System.out.println("The front door is " + frontDoor.getState());
		System.out.println("Expected: open");
		
		Door backDoor = new Door("Back", "closed");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected: closed");
		
		// Use the mutator to change the state variable
		backDoor.open();
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected: open");
		
		// testing of the setName method
		backDoor.setName("metal");
		System.out.println("The back door name is: " + backDoor.getName());
		System.out.println("Expected: metal");
	}
}
