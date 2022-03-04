package baitap2;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int so = input.nextInt();
        int temp = 1;
        for(int i = 1; i <= so; i++){
            temp *= i;
        }
        System.out.println("Giai thua cua: " + so + " la: " + temp);
    }
}
