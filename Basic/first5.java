package LeetCode.MainFile.Basic;


//Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class first5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Firs number ");
        int num = in.nextInt();
        System.out.println("Enter the Second number ");
        int num2 = in.nextInt();

        int a= num;
        int b=num2;

        // find the HCF of given input
        while(b!=0){
            int temp = b;
            b = a%b;
            a=temp;
        }

        System.out.println("The value of the HCF is " + a);


        // to find the LCM of the given inputs

        int HCF = a;

        int lcm = (num*num2)/HCF;

        System.out.println("The value of the LCM is "+lcm);


    }
}
