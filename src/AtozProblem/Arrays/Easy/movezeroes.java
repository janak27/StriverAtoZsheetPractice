package AtozProblem.Arrays.Easy;

import java.util.Arrays;

public class movezeroes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,0,1,0,1,0,1,1};
        int n  = arr.length;
        System.out.println(Arrays.toString(arr));
        // two pointer approach
        int k = 0;
        while (k < n){
            if(arr[k] == 0){
                break;
            }
            else{
                k++;
            }
        }

        int i = k , j = i+ 1;
        while (i < arr.length && j < arr.length){
            if (arr[j] != 0 ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));



    }
}
