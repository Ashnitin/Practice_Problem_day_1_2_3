package com.ifelseexample;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character:");
        char ch=sc.next().charAt(0);
        boolean v= false;
        switch(ch){
            case 'a':
            case'e':
            case'i':
            case'o':
            case'u':
            case'A':
            case'U':
            case'I':
            case'E':
            case'O':
            v=true;
        }
if(v==true){
    System.out.println("Its a Vowel"+ ch);

}
else {
   if(ch>='a'&&ch<='z' || ch>='A' && ch<='Z')
   {
       System.out.println("Its  Consonant"+ ch);
   }
   else{
       System.out.println("Its  not alphabet");
   }
}
    }
}
