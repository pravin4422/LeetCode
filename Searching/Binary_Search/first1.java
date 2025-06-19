package LeetCode.MainFile.Searching.Binary_Search;


//it just for the normal way to slove the benary search
//and also combine the both


public class first1 {
    public static void main(String[] args) {
           int [] array = {1,3,5,6,7,8,9,13,15,16,17,19};
       // int[] array = {19, 18, 17, 16, 15, 14, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 14;
        int answer = SearchElement(array, target);
        System.out.println("The element in the array or not " + answer);
    }

//    assending order array solveing code
//    static int SearchElement(int [] arr,int target){
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start<=end){
//            int mid = start+(end-start)/2;
//
//            if(target<arr[mid]){
//                end =mid-1;
//            } else if (target>arr[mid]) {
//                start=mid+1;
//            }
//            else {
//                return arr[mid];
    //                return mid;
//            }
//
//        }
//        return -1;
//    }


// for the decending order code of this
// static int SearchElement(int[] arrays,int target){
//        int start =0;
//        int end = arrays.length-1;
//
//        while(start<=end){
//            int mid = start+(end-start)/2;
//            if (target<arrays[mid]){
//                start=mid+1;
//            } else if (target>arrays[mid]) {
//                end=mid-1;
//            }else {
//                //return mid;
//                return arrays[mid];
//            }
//
//        }
//        return -1;
//
// }


//    if you don't know the wherether it  is assending or decending order apply this tecknick
    static int SearchElement(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean one = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid]==target){
                return mid;
            }


            if (one) {
                //assending
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;

                }

            } else {

                //decending

                if (target < arr[mid]) {
                    start= mid +1;
                } else {
                    end = mid - 1;
                }


            }


        }
        return -1;
//        if the we need to fine the ceiling use this return arr[start];
//        if the we need to fine the floor use this return arr[end];
    }
}