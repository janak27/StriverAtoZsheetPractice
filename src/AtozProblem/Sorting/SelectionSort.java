package AtozProblem.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,8,4,9,1};
        System.out.println(Arrays.toString(arr));
        System.out.println("the sorted array" + Arrays.toString(Sel(arr)));
    }

    private static int[] Sel(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]){
                    min = j;
                }
                //swap
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
