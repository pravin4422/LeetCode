package LeetCode.MainFile.Basic;



//Take a number as input and print the multiplication table for it.


import java.util.Scanner;

public class first3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Multiplication(num);
    }

    static int Multiplication(int num){
        for (int i=1;i<=10;i++){
            System.out.println(i*num);

        }
        return 0;
    }
}
