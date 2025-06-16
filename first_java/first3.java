package LeetCode.MainFile.first_java;

//3. Write a program to input principal, time, and rate (P, T, R) from the user and
//        find Simple Interest.

import java.util.Scanner;

public class first3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Principle");
        int principle = in.nextInt();
        System.out.println("Enter the time");
        int time = in.nextInt();
        System.out.println("Enter the rate");
        int rate = in.nextInt();
        int answer = SimpleInteres(principle,time,rate);
        System.out.println("The simple interes is the "+answer);
    }
    static int SimpleInteres(int principle,int time,int rate){

        int values = (principle*time*rate)/100;
        return values;
    }
}
