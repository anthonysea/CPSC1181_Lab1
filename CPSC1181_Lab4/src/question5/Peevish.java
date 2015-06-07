package question5;

public class Peevish {
	public static void main(String[] args) {
		boolean[] door;
		final int NODOORS = 101; // we will not use door[0]
		final boolean OPEN = true;
		final boolean CLOSED = false;
		// initialize the doors
		door = new boolean[NODOORS];
		for (int i = 0; i < NODOORS; i++) {
			door[i] = CLOSED;
		}
		
		for (int i = 1; i < NODOORS; i++) {
			for (int j = 1; j < NODOORS; j++) {
				if (j % i == 0 ) {
					door[j] = !door[j];
				}
			}
		}
		
		// print the state of each door (only doors 1-100)
		for (int i = 1; i < NODOORS; i++) {
			if (door[i]) {
				System.out.println("Door " + i + " is open.");
			} else {
				System.out.println("Door " + i + " is closed."); 
			}
		}
	}
}