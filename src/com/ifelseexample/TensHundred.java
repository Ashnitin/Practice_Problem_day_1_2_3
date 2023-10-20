package com.ifelseexample;

import java.util.Scanner;

public class TensHundred {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice\n1\n10\n100\n1000\n");
        int n=sc.nextInt();

        if(n==1){
            System.out.println("Unit place");
        }
        if(n==10){
            System.out.println("tens place");
        }
        if(n==100){
            System.out.println("Hundred place");
        }
        if(n==1000){
            System.out.println("Thousands place");
        }

    }
}
