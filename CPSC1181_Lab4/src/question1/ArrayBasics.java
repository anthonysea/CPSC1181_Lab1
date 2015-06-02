package question1;



/**
 * This program does some basic operations with arrays
 * 
 * @version 0.1
 * @author Anthony Chao
 *
 */

public class ArrayBasics {
	public static void main(String[] args) {
		
		// create an array x with the initialized values
		double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
		
		// print the number of items in the array
		System.out.println(x.length);
		
		// print the first element
		System.out.println(x[0]);
		
		// print the last element
		System.out.println(x[8]);
		
		// print the expression x[x.length -1]
		System.out.println(x[x.length - 1]);
		// It is the same because the length of the array minus one is the number of 
		// elements in the array since the indexing is zero-based
		
		// use a for loop to print the elements of the array
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		// reverse for loop to print the elements of the array in reverse
		for (int i = x.length - 1; i >= 0; i--) {
			System.out.println(i + ": " + x[i]);
		}
		System.out.println("\n\n\n");
		
		// print the elements of the array using an enhanced for loop
		for (double element : x) {
			System.out.println(element);
		}
	}
}
