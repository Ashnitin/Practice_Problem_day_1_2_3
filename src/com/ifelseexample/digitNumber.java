package com.ifelseexample;

import java.util.Scanner;

public class digitNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr Single digit no:");
        n=sc.nextInt();

        if(n==0){
            System.out.println("Zero");
        }
        else if (n==1) {
            System.out.println("One");
        }
        else if (n==2) {
            System.out.println("Two");
        }
        else if (n==3) {
            System.out.println("Three");

        }
    }
}
