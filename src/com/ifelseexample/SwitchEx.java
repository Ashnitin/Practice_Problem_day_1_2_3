package com.ifelseexample;
import java.util.*;
public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,r,ch;
        System.out.println("Enter first no:");
        a=sc.nextInt();
        System.out.println("Enter second no:");
        b=sc.nextInt();
        System.out.println("*************Java Calculator*************");
        System.out.println("Enter Choice:\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.modulus");
        ch=sc.nextInt();

        switch (ch){
            case 1:
                r=a+b;
                System.out.println("Addition is"+r);
            break;
            case 2:
                r=a-b;
                System.out.println("Substraction is"+r);
                break;
            case 3:
                r=a*b;
                System.out.println("Multiplication is is"+r);
                break;
            case 4:
                r=a/b;
                System.out.println("Division is"+r);
                break;
            case 5:
                r=a%b;
                System.out.println("Modulus is"+r);
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }
}
