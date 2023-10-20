package com.ifelseexample;

public class NestedIfEx {
    public static void main(String[] args) {
        int x=10;
        int y=20;

        if(x==10) {
            if (y != 20) {
                System.out.println("Hello..");
            } else {
                System.out.println("Welcome....");
            }
        }
        else {
            System.out.println("Last else");
        }
    }
}
