package prgs;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int jerry,tom,temp;
  Scanner sc = new Scanner(System.in);
  System.out.println("Apples with Jerry before : ");
  jerry = sc.nextInt();
  System.out.println("Apples with Tom before : ");
  tom = sc.nextInt();
  temp = jerry;
  jerry = tom;
  tom = temp;
  System.out.println("Apples with Jerry after : "+ jerry);
  System.out.println("Apples with Tom after :"+ tom);
  sc.close();
	}
}