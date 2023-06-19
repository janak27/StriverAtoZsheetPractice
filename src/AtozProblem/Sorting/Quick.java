package AtozProblem.Sorting;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,6,8,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(qs(arr,0, arr.length-1)));
    }

    public static int[] qs(int[] arr, int low, int high) {
        if (low < high) {
            int p = part(arr, low, high);
            qs(arr, low, p - 1);
            qs(arr, p + 1, high);
        }
        return arr;
    }

    static int part(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr [j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low]  = arr[j];
        arr[j] = temp;
        return j;
    }
}
