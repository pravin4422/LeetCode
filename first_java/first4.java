package LeetCode.MainFile.first_java;

//5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class first4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num = in.nextInt();
        System.out.println("Enter the second number ");
        int nums = in.nextInt();
        if (num>nums){
            System.out.println("The larger number is "+num);
        }
        else {
            System.out.println("The samlles number is "+nums);
        }
    }
}
