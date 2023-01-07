package BinarySearch;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to Binary search");
        System.out.println("only applied on Sorted arrays");
        int[] arr = {2,3,4,6,8,7,12,13,45,56,78,89,99};
        int target = 56;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }


    static int binarysearch(int[] arr, int target ){
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
}
