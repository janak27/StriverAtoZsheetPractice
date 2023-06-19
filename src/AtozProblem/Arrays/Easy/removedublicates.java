package AtozProblem.Arrays.Easy;

import java.util.Arrays;

public class removedublicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,2,3,4};
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }

        }
        int[] sub = Arrays.copyOfRange(arr,0,i+1);
        System.out.println(Arrays.toString(sub));

    }
}
