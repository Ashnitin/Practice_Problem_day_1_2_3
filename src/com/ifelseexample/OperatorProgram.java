package com.ifelseexample;

import java.util.Scanner;

public class OperatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double r1,r2,r3,r4;
        System.out.println("Enter Three no:" );
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        //System.out.println("Enter your choice:\n1) a+b*c\n2) c+a/b\n3)a%b+c\n4)a*b+c");
        //ch=sc.nextInt();


            r1=a+b*c;
                System.out.println("a+b*c: "+r1);

            r2= c+ (double) a /b;
                System.out.println("c+a/b: "+r2);

            r3= a%b+c;
                System.out.println("a%b+c: "+r3);

            r4=a*b+c;
            System.out.println("a*b+c: "+r4);

                double max=Math.max(Math.max(r1,r2),Math.max(r3,r4));
                double min=Math.min(Math.min(r1,r2),Math.min(r3,r4));
        System.out.println("Maximum is:"+max);
       System.out.println("Minimum is:"+min);

    }
}