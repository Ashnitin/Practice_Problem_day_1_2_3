package com.bridgelabz;

public class SumAndCountInvalidIntUsingCLA {
    public static void main(String[] args) {
        int sum= 0;
        int invalidCount=0;
            for (String arg : args) {
                try {
                    int num = Integer.parseInt(arg);
                    sum += num;
                }
                catch (Exception e ){
                    invalidCount++;
                    System.out.println(invalidCount);
                }
            }
    }
}
