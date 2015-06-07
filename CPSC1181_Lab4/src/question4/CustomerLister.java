package question4;
/**
 * This programs lists customers and asks the user to enter their respective balances
 * @version 0.1
 * @author Anthony Chao
 *
 */
import java.util.Scanner;

public class CustomerLister {
	public static void main(String[] args) {
		String[] customerName = {"Cathy", "Ben", "Jorge", "Wanda", "Freddie"};
		double[] customerBalance = new double[5];
		Scanner input = new Scanner(System.in);
		
		System.out.println("1)");
		int i = 0;
		for (String customer : customerName) {
			System.out.println("  " + customer);
			System.out.print("Enter a balance: ");
			customerBalance[i] = input.nextDouble();
			i++;
		}
		

	}
}
