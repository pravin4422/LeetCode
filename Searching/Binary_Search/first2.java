package LeetCode.MainFile.Searching.Binary_Search;


//slove the problem of the Ceiling
//in the ceiling problem start will return



public class first2 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 7, 8, 9, 13, 15, 16, 17, 19};
        // int[] array = {19, 18, 17, 16, 15, 14, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 2;
        int answer = SearchElement(array, target);
        System.out.println("The element in the array or not " + answer);
    }

    // assending order array solveing code
    static int SearchElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];


            }
        }
        return arr[start];
    }
}
