package question2;
/**
 * This program shifts a given array with a provided integer of displacement
 * 
 * @version 0.1
 * @author Anthony Chao
 *
 */

public class Arrays {
	public static void main(String[] args)
	{
		double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
		System.out.println("Before rotation: ===============================");
		for (int i = 0; i < x.length; i++) 
        { 
			System.out.println("x[" + i + "]:  " + x[i]); 
	    } 
	    x = rotate(x, 3); 
	    System.out.println("After rotation:  =========================");        
	    for (int i = 0; i < x.length; i++) 
	    { 
	        System.out.println("x[" + i + "]:  " + x[i]); 
	    }  
	      
	}
	
	public static double[] rotate(double[] oldArray, int number) {
		double[] newArray = new double[oldArray.length];
		for (int i = 0; i < newArray.length; i++) {
			// checks to see if the array + the displacement is greater than the
			// length
			if (i + number >= newArray.length) {
				// uses the mod operator with the length of the array 
				// to get the index of the new place for the number
				newArray[(i + number) % newArray.length] = oldArray[i];
			} else {
				newArray[i + 3] = oldArray[i];
			}
		}
		return newArray;
	}
}
