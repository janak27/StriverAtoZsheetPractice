package AtozProblem.Searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("welcome to Binary search");
//        System.out.println("only applied on Sorted arrays");
        int[] arr = {2,3,4,6,8,7,12,13,45,56,78,89,99};
        int target = 56;
        System.out.println(Arrays.toString(arr));
        System.out.println("target is :" +target);
//        int ans = binarysearch1(arr,target);
//        System.out.println(ans);
        int ans2 = binarysearch2(arr,target);
        System.out.println(ans2);
    }


    static int binarysearch1(int[] arr, int target ){
        int start = 0;
        int end = arr.length - 1;

        while (start<=end){
            int mid = start + (end - start)/2;
            if( target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start =  mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int binarysearch2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else if (target > arr[mid]){
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else if (target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
