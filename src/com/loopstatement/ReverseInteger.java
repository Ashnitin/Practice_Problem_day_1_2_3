package com.loopstatement;

public class ReverseInteger {
    public static void main(String[] args) {

        int n=231,r,s=0;
        while(n>0)
        {
            r=n%10;
            s=(10*s)+r;
            n=n/10;
        }
        System.out.println("Reverse Number is:"+s);
    }
}
