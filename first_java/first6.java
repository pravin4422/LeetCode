package LeetCode.MainFile.first_java;

import java.util.Scanner;

//7. To calculate Fibonacci Series up to n numbers.
public class first6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.println("Enter how many Fibonacci numbers to print:");
        int n=in.nextInt();
        int i=0;
        while (i<n){
            System.out.print(a);
            int temp = a+b;
            a=b;
            b=temp;
            i++;
        }

    }
}
