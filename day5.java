
 import java.util.Arrays;
public class day5 {

    public  static void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        // 1. Find the first decreasing element from the right
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // 2. Find the smallest element to the right that is greater than arr[i]
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }

            // 3. Swap arr[i] and arr[j]
            swap(arr, i, j);
        }

        // 4. Reverse the subarray to the right of i
        reverse(arr, i + 1, n - 1);
    }

    private  static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static  void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 7, 5, 0 };
        nextPermutation(arr);

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
}
}

