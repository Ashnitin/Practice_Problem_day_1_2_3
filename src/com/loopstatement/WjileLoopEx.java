package com.loopstatement;
import java.util.*;
public class WjileLoopEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No:");
        int n,s=0,r,temp;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            s=(r*r*r)+s;
            n=n/10;
        }
        temp=s;
        if(n==temp) {
            System.out.println("It is amstrong no" + s);
        }
        else {
            System.out.println("It is not amstrong no" + s);
        }
    }
}
