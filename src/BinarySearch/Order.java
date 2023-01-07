package BinarySearch;

public class Order {
    public static void main(String[] args) {
//        int[] arr = {2,3,4,6,8,7,12,13,45,56,78,89,99};
        int[] arr = {99,88,77,66,55,44,33,22,11};
        int target = 33;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target) {
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
