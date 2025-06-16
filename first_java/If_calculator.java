package LeetCode.MainFile.first_java;

import java.util.Scanner;

public class If_calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num = in.nextInt();
        System.out.println("Enter the second number ");
        int num2 = in.nextInt();
        System.out.println("Enter the Character ");
        String prime = in.next();
        if(prime.equals("+")){
            int value =num+num2;
            System.out.println("The Sum of the values" + value);
        } else if (prime.equals("-")) {
            int values = num - num2;
            System.out.println("The sub of the value is "+ values);
        }else if (prime.equals("*")) {
            int values = num * num2;
            System.out.println("The mul of the value is "+ values);
        }else if (prime.equals("/")) {
            int values = num / num2;
            System.out.println("The div of the value is "+ values);
        }else if (prime.equals("%")) {
            int values = num % num2;
            System.out.println("The module of the value is "+ values);
        }

    }

}
