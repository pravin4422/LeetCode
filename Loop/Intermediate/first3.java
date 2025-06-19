package LeetCode.MainFile.Loop.Intermediate;

//3. Calculate Average Of N Numbers

import java.util.Scanner;

public class first3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number values ");
        int n = in.nextInt();
        int [] a = new int [n];
        System.out.println("Enter the number of arrays ");
        for( int i=1;i<=n;i++){
            a[i]=in.nextInt();
        }
        int vlaues = 0;
        for(int j=1;j<=n;j++){
            vlaues +=a[j];
        }
        int answer = vlaues/n;
        System.out.println("The average value of the n number is "+ answer);

    }
}
