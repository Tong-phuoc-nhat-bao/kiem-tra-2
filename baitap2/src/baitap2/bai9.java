package baitap2;

import java.util.Scanner;

public class bai9 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int num1,num2, r = 0;
	    System.out.println("Nhap so: ");
	    num1 = input.nextInt();
	    num2 = num1;
	    while(num1 != 0) {
	      int d = num1 % 10;
	      r = r * 10 + d;
	      num1 /= 10;
	    }
	    System.out.println("So sau khi dao nguoc la: "+ r);
	  }
}
