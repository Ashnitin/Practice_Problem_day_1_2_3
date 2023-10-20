package com.loopstatement;

import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n,s=0,r,temp;
        n=sc.nextInt();
        int d=n;
        for(;n!=0;n=n/10){
            r=n%10;
            s=(s*10)+r;

        }
        //temp=s;
       if(d==s){
           System.out.println("Palindrome no"+s);
       }
       else {
           System.out.println("Not Palindrome number");
       }
    }
}
