package KunalKushwahaDSA.Recursion.arrays;

import java.util.Arrays;

public class PatternAndSorts {
    public static void main(String[] args) {
//        fun1(5,0);
        int[] arr = {6,7,8,9,1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }


    static void bubble(int[] arr, int r, int c){
        if (r==0){
            return;
        }
        if(c < r){
            if (arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr,r,c+1);
        }
        else {
            bubble(arr,r-1,0);
        }
    }

    static void fun1(int r, int c){
        if(r==0){
            return;
        }

        if(c < r){
            System.out.print("*");
            fun1(r, c+1);
            System.out.print("*");

        }
        else {
            System.out.println();
            fun1(r-1,0);
            System.out.println();

        }
    }
}
