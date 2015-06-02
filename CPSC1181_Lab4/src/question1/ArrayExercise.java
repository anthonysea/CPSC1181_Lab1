package question1;
/**
 * This program tests a few operations with arrays
 * @version 0.1f
 * @author Anthony Chao
 *
 */

public class ArrayExercise {
	public static void main(String[] args) {
		// create an array x with the initialized values
		double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
		
		// compute the sum of all elements using an enhanced for loop
		double sum = 0;
		for (double element : x) {
			sum += element;
		}
		System.out.println(sum);
		
		// compute the sum of all elements using a standard for loop
		sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
		
		// find the minimum value in x
		double min = x[0];
		for (double element : x) {
			if (min > element) {
				min = element;
			}
		}
		System.out.println(min);
		
		// find the factors of every other number
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + ": ");
			for (int j = 0; j < x.length; j++) {
				if (x[i] % x[j] == 0) {
					System.out.print(x[j] + " ");
				}
			}
			System.out.println();
		}
	}
}
