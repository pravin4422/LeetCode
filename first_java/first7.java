package LeetCode.MainFile.first_java;

//8. To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class first7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string ");
        String name = in.next();
        int n=name.length();

        // here we set the flag
        boolean bool = true;
        for(int i=0;i<n/2;i++){
            if(name.charAt(i)!=name.charAt(n-1-i)){
                bool = false;
                break;
            }

        }
        if(bool){
            System.out.println("The give character is Palindrome "+ name);
        }else {
            System.out.println("The give character is not Palindrome "+name);
        }
    }
}
