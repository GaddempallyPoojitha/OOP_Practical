package prgms;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 String input = sc.nextLine();
 StringBuilder sb = new StringBuilder(input);
 String reversed = sb.reverse().toString();
 if(input.equalsIgnoreCase(reversed)) {
	 System.out.println("String is a palindrome");
 } else {
	 System.out.println("String is not a palindrome");
 }
 sc.close();
	}

}
