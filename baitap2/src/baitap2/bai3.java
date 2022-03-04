package baitap2;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Nhap so n: ");
	int n = input.nextInt();
        int tong=0;
        for(int i=0;i<n;i++)
        {
            System.out.print("Nhap so thu "+(i+1)+" :" );
            int a = input.nextInt();
            tong= tong+a;
        }
        System.out.print("Tong la: "+tong );      
    }
}
