package AtozProblem.Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5,8,4,9,1};
        System.out.println(Arrays.toString(arr));
        System.out.println("the sorted array" + Arrays.toString(Ins(arr)));
    }

    static int[] Ins(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
