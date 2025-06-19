package LeetCode.MainFile.Searching.LinearSearch;





public class first1 {
    public static void main(String[] args) {
    int[] nums = {12,345,2,6,7896};
    int answer = findnumber(nums);
        System.out.println("The number os even digits number "+ answer);

    }
    static int findnumber(int[] nums){
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int values = digits(num);
        if (values%2==0){
            return true;
        }
        return false;

    }
    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num/= 10;
        }
        return count;

    }

}
