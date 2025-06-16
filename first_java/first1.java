package LeetCode.MainFile.first_java;
import java.util.*;

//1. Write a program to print whether a number is even or odd, also take
//input from the user.

public class first1 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        //int num=in.nextInt();
       // EVER_ODD(num);

            char let = 'x';
            while (true) {
                System.out.println("Enter the number");
                int num=in.nextInt();
                if (num % 2 == 0) {
                    System.out.println("this is the even number" + num);
                } else if (num == let) {
                    break;
                } else{
                    System.out.println("this is the Odd number" + num);
                }
            }


    }

    static void EVER_ODD(int nums){
            if (nums % 2 == 0) {
                System.out.println("this is the even number" + nums);
            } else{
                System.out.println("this is the Odd number" + nums);
            }

    }

}
