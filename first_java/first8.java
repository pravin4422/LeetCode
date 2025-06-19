package LeetCode.MainFile.first_java;

//9. To find Armstrong Number between two given number.

import java.util.Scanner;

public class first8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = in.nextInt();
        int original = num;
        int nums = String.valueOf(num).length();
        int sum =0;
        for( int i =0;i<nums;i++){
            int remainder = num%10;
//            int arms = remainder*remainder*remainder; // only for the three intigers
            int arms = (int) Math.pow(remainder, nums); // if any any number of intigers

            sum+=arms;
             num =num/10;

        }
        if(sum ==original){
            System.out.println("The Armstrong Number is ");
        }else {
            System.out.println("The Armstrong number is not ");
        }


    }
}
