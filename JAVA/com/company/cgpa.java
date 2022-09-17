//WAP TO CALC. CGPA OF 3 SUBJECT USING MARKS!

package com.company;
import java.util.Scanner;
public class cgpa
{
    public static void main(String args[]){
    System.out.println("Getting input of marks from user");
    Scanner marks = new Scanner(System.in);
    int a = marks.nextInt();
    int b = marks.nextInt();
    int c= marks.nextInt();
    System.out.println("Enter the value of english,maths and science",a,b,c);
    
}
}