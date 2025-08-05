package practical2;

import java.util.Scanner;

public class StrTasks1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		System.out.println("charAt(): " + input.charAt(4));
		System.out.println("length(): " + input.length());
		System.out.println("toUpperCase(): " + input.toUpperCase());
		System.out.println("toLowerCase(): " + input.toLowerCase());
		System.out.println("substring(x,y): " + input.substring(3, 7));
		System.out.println("contains(\" \"): " + input.contains("World"));
		sc.close();
	}

}
