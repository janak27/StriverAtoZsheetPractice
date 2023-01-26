package AtozProblem.Recursion;
import java.util.Arrays;

public class Reversearray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int left = 0;
        int right = arr.length - 1;
        Rev(left,right,arr);
    }

    static int[] Rev( int left,int right,int[] arr){
        if(left < right){
            int temp = arr[left];
            arr[left] = arr [right];
            arr[right] = temp;
            System.out.println(Arrays.toString(arr));
            Rev(left + 1,right - 1,arr);
        }
        else{
            return arr;
        }

        return arr;

    }
}
