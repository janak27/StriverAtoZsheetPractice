package AtozProblem.Arrays.Easy;

import java.util.Arrays;

public class leftrotatearr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        int d = 4;
        d = d % arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] =  arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

}
