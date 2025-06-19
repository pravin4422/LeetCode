    package LeetCode.MainFile.first_java;
    import java.util.*;


    //2. Take name as input and print a greeting message for that particular name.?

    //
//            check the user input is string or not their or two way
//            if (input instanceof String) {
//            System.out.println("✔ The input is a String object.");
//            } if (input.matches("[a-zA-Z]+")) {
//            System.out.println("✔ The input contains only letters.");
//            }
    
    
    public class first2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
     //       System.out.println("Enter the name ");
      //      String name=in.nextLine();
     //        Greedy(name);
            char let = 'x';
//            String lets = "x";
            while (true) {

                System.out.println("Enter the String");
                String name = in.nextLine();
                if(name.equals("x")){
                    break;}
                else if (name instanceof String) {
                    System.out.println("Wish you many more happy returns of the day " + name);
                }
                }

            }


//        static void Greedy(String names){
//                System.out.println("wish you many more happy birthday " + names);
//        }

    }
