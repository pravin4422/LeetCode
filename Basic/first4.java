package LeetCode.MainFile.Basic;


//. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.*;
public class first4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true){
            System.out.println("Enter the number ");
            String name = in.nextLine();
            if(name.equals("x")){
                System.out.println("The loop is break");
                break;

            }else {
                int num = Integer.parseInt(name);
                System.out.println("The number is "+ num);
            }
        }
        in.close();
    }

}
