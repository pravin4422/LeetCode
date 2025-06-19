package LeetCode.MainFile.Loop.Intermediate;

import java.util.Scanner;

//1. Factorial Program In Java
public class first1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of factorial ");
        int n = in.nextInt();
        int values = 1;
        for(int i = n; i>1;i--){
             values = values * i;

        }
        System.out.println("The total value of the factorial is "+ values);
    }

}
