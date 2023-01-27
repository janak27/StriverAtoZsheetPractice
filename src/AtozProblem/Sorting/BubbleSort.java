package AtozProblem.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the size of array");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the"+ i +"th element of array");
            arr[i] = sc.nextInt();
        }
        System.out.print("your array is :");
        System.out.println(Arrays.toString(arr));
        System.out.println("the sorted array is : "+ Arrays.toString(bubble(arr)));
    }
    static int[] bubble(int[] arr){
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            boolean swap = false;

            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println(Arrays.toString(arr));
                    swap = true;

                }
            }
            if (!swap){
                break;
            }
        }
        return arr;
    }
}
