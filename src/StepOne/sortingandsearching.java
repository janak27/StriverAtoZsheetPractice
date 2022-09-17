package StepOne;

import java.util.Arrays;

public class sortingandsearching
{
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 1, 9, 7, 6, 8};
        System.out.println(Arrays.toString(arr));
        insertion(arr);
//        bubble(arr);
//        selection(arr);
//        System.out.println(Arrays.toString(arr));
//        linearSearch(arr,2);
//        System.out.println(BinarySearch(arr,9));

        System.out.println(Arrays.toString(arr));
    }
    static int BinarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while ( start <= end){

            int mid = start + (end - start)/2;

            if ( key < arr[mid]){
                end = mid - 1;
            }
            else if(key > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }

    static int linearSearch(int[] arr, int key ) {
        int i;
        int index = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                return index;
            }
        }
        return -1;
    }

    static void insertion(int[] arr) {

        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }

        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            // find the maximum item in remaining array and swap it with correct position

            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap( arr, maxIndex, last);
        }

    }
    static int getMaxIndex(int[] arr, int start, int end) {

        int max =  start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }

    static void bubble(int[] arr) {

        boolean swapped;
        // run steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                // swap if max
                if (arr[j] < arr[j - 1]) {
//                    int tem = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = tem;
                    swap(arr,j,j-1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }


}


