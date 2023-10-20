package com.ifelseexample;

import java.util.Scanner;

public class OperatorProgram2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,d;
        System.out.println("Enter Month:");
        m=sc.nextInt();
        System.out.println("Enter Day:");
        d=sc.nextInt();

        if (m<3 &&d <20){
            System.out.println(true);
        } else if (m>6 && d>20) {
            System.out.println(false);

        }


    }
}
