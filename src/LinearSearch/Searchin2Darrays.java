package LinearSearch;

import java.util.Arrays;

public class Searchin2Darrays {
    public static void main(String[] args) {
        int[][] arr = {
                {12,45,78},
                {23,56,89},
                {14,25,36},
        };
        int target = 45;

        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        int maxi = max(arr);
        System.out.println(maxi);

        int mini = min(arr);
        System.out.println(mini);
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }
        }
        return min;
    }
}
