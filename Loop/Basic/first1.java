package LeetCode.MainFile.Loop.Basic;

import java.util.Scanner;

//1. Area Of Circle Java Program
public class first1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("enter the radius values ");
        double radius = in.nextDouble();
       double answer = Area_of_Circle(pi,radius);
        System.out.println("The value of the Area of Circle "+answer);
    }
    static double Area_of_Circle(double pis,double radius){
        double value = pis*radius*radius;
        return value;
    }
}
