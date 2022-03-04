package baitap2;

import java.util.Scanner;

class bai6
{
   public static void main (String[] args)
   {		
       int i =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so n : ");
        int n = input.nextInt();
        int num;
       String  primeNumbers = "";

       for (i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {

	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("So Nguyen to la :");
       System.out.println(primeNumbers);
   }
}
