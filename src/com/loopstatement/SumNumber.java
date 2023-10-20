package com.loopstatement;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        System.out.println("Enter no:");
       Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       int  sum=0,i=1;

        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Addition is"+sum);
    }
}
