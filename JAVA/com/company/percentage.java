//WAP to calculate the % of a given student from 5 subjects//

package com.company;
import java.util.Scanner;
public class percentage {
    public static void main(String args[])
    {
      System.out.println("Taking input of marks in every subject");
      Scanner s = new Scanner(System.in);
      System.out.println("Enter marks of science");
      int a = s.nextInt();
      System.out.println("Enter marks of maths");
      int b = s.nextInt();
      System.out.println("Enter marks of socail studies");
      int c = s.nextInt();
      System.out.println("Enter marks of english");
      int d = s.nextInt();
      System.out.println("Enter the marks of hindi");
      int e = s.nextInt();
      float sum = a+b+c+d+e;
      float percentage = (sum/500)*100;

      System.out.println("The total percentage is:");
      System.out.println(percentage + "%");
    }
    
}
