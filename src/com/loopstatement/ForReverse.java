package com.loopstatement;

import java.util.Scanner;

public class ForReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n,s=0,r;
        n=sc.nextInt();

        for(;n!=0;n=n/10){
            r=n%10;
            s=(s*10)+r;

        }
        System.out.println("Reverse no is:"+s);
    }
}
