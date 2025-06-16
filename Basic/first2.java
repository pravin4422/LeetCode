package LeetCode.MainFile.Basic;

//2. Take two numbers and print the sum of both.

import java.util.*;
public class first2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num2 = in.nextInt();
        int sum = Sum(num,num2);
     System.out.println(sum);
    }
    static int Sum(int num,int num2){
        int sums = num+num2;
        return sums;
    }

}
