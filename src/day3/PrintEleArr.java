package day3;

import java.util.Scanner;

public class PrintEleArr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter elments for array: ");
        for (int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter elments are: ");
        for (int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}
