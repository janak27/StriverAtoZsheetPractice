package AtozProblem.Sorting;

import java.util.Arrays;

public class RecBubble {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(RecursiveBubble(arr, arr.length)));
    }
    static int[] RecursiveBubble(int[] arr, int n){
        if( n == 1) return arr;
//        int swap = 0;
        for (int i = 0; i <=  n - 2; i++) {
            if(arr[i] > arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
//                swap = 1;
            }
//            if (swap == 0) return arr;
        }
        RecursiveBubble(arr,n -1 );
        return arr;
    }

}
