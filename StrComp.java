package practical2;

import java.util.Scanner;

public class StrComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st String : ");
		String input1 = sc.nextLine();
		System.out.println("Enter 2nd String : ");
		String input2 = sc.nextLine();
		String obj1 = new String(input1);
        String obj2 = new String(input2);

        System.out.println("Comparing using equals(): " + obj1.equals(obj2));
        System.out.println("Comparing using ==: " + (obj1 == obj2));
    sc.close();
	}

}
