package com.bridgelabz;
/*
step 1:start
step 2:declare year variable
step 3:use scanner class for user input
step 4:if(year>=1582)
            if((year %4==0) && (year%100!=0 )|| (year%400==0))
            true display msg
            else
            false display msg
        else
            display invalid msg
step 5:stop

*/

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year: ");
        year=sc.nextInt();

        if(year>=1582){
            if((year %4==0) && (year%100!=0 )|| (year%400==0)){
                System.out.println(year +" is Leap Year");
            }
            else {
                System.out.println(year +" is not Leap Year");
            }

        }
        else {
            System.out.println("Enter Valid Year");
        }
    }
}
