package prgs;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  double bill,gst,maintenance,total,fin;
  Scanner sc = new Scanner(System.in);
  System.out.println("bill : ");
  bill = sc.nextDouble();
  gst = bill * 0.18;
  maintenance = bill * 0.05;
   total = bill + gst + maintenance;
   if(total >= 1000) {
	   fin = total - (total*0.10);
   } else {
	   fin = total - (total*0.05);
   }
   System.out.println("bill : "+bill);
   System.out.println("gst : "+gst);
   System.out.println("maintenance : "+maintenance);
   System.out.println("final : "+fin);
   sc.close();
	}
}