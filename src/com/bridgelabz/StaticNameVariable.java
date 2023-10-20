package com.bridgelabz;
/*
step 1:start
step 2:declare static variable
step 3:declare static block
step 4:call static method in main
step 5:stop
 */
public class StaticNameVariable {
    static int x=10;
    static int y;
    static void dis(int a){
        System.out.println("a = "+a);
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
    static {
        System.out.println("static block initialized.");
        y=x*4;
    }

    public static void main(String[] args) {
        dis(5);
    }

}
