package com.company;
import java.util.Scanner;
public class sumof3 {
    public static void main(String args[]){
        System.out.println("Enter the number you want sum of ");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        float a=sc.nextFloat();
        System.out.println("Enter the next value:");
        float b = sc.nextFloat();
        System.out.println("Enter the last value");
        float c = sc.nextFloat();
        float sum= a+b+c;
        System.out.println("The sum of the 3 numbers is:"+sum);
    }
}
