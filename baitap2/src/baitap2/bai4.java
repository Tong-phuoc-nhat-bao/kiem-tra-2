package baitap2;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Nhap a: ");
			int a = input.nextInt();
			int dem=0;
			while (a!=0) {
				a=a/10;
				dem++;
			}
			System.out.print("So vua cho co "+dem+" chu so");
		}catch(Exception e) { 
			System.out.print("Nhap sai du lieu.");
		}
	}
}
