package LeetCode.MainFile.Loop.Basic;

//2. Area Of Rectangle

import java.util.Scanner;

public class first2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of rectangle ");
        double length = in.nextDouble();
        System.out.println("Enter the breath of rectangle ");
        double breath = in.nextDouble();
        double answer = Area_of_Rectangle(length,breath);
        System.out.println("The Area of Rectangle "+ answer);
    }

     static double Area_of_Rectangle(double length, double breath) {
         return (length*breath)/2;
    }
}
