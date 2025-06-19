package LeetCode.MainFile.first_java;

import java.util.Scanner;

//6. Input currency in rupees and output in USD.
public class first5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Rupees ");
        double values = in.nextDouble();
        double usd = 83.20;
        double cal =values/usd;
        System.out.println("The rupess in the USD doller "+cal);


    }
}
