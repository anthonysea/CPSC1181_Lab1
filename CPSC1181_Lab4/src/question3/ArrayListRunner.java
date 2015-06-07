package question3;
/**
 * This program runs some basic operations with ArrayLists
 * 
 * @version 0.1
 * @author Anthony Chao
 *
 */
import java.util.ArrayList;

public class ArrayListRunner {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names);
		
		names.add("Alice");
		names.add("Bob");
		names.add("Connie");
		names.add("David");
		names.add("Edward");
		names.add("Fran");
		names.add("Gomez");
		names.add("Harry");
		
		System.out.println("a) " + names);
		System.out.println("b) first name: " + names.get(0) + "\t last name: " + names.get(names.size() - 1));
		System.out.println("c) " + names.size());
		System.out.println("d) " + names.get(names.size() -1));
		names.set(0, "Alice B. Toklas");
		System.out.println("e) " + names);
		names.add(4, "Doug");
		System.out.println("f) " + names);
		System.out.print("g) ");
		for (String element : names) {
			System.out.println(element);
		}
		ArrayList<String> names2  = new ArrayList<String>(names);
		System.out.println("h) " + names2);
		names.remove(0);
		System.out.println("i)");
		System.out.println("names: " + names);
		System.out.println("names2: " + names2);
	}
}
