package prgs;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n;
 Scanner sc = new Scanner(System.in);
 System.out.println("n : ");
 n = sc.nextInt();
 for(int i=1;i<=n;i++) {
	 System.out.println("Sqrt of " + i + "=" + Math.sqrt(i));
 }
 sc.close();
	}
}