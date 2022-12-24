package LinearSearch;

import java.util.Arrays;

public interface Searchin2Darrays {
    public static void main(String[] args) {
        int[][] arr = {
                {12,45,78},
                {23,56,89},
                {14,25,36},
        };
        int target = 45;

        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
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
}
