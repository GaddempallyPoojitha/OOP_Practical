package prgms;
import java.util.Scanner;
public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 String input = sc.nextLine();
 int vowelCount = 0;
 for(int i=0;i<input.length();i++) {
	 char ch = input.charAt(i);
	 if("aeiou".indexOf(ch) != -1) {
		 vowelCount++;
	 }
 }
 System.out.println("No.of vowels : " + vowelCount);
 sc.close();
	}

}