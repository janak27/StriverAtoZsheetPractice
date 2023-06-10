package AtozProblem.Sorting;

import java.util.Arrays;
//import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("enter the size of array");
//        int n  = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("enter the"+ i +"th element of array");
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {5,4,3,2,1};
        System.out.print("your array is :");
        System.out.println(Arrays.toString(arr));
//        System.out.println("the sorted array is : "+ Arrays.toString(bubble(arr)));
        System.out.println("the sorted array is : "+ Arrays.toString(bubble2(arr,5)));

    }
    static int[] bubble2(int[] arr, int n){
        for (int i = n-1 ; i >=0 ; i--) {
            int swap = 0;
            for (int j = 0; j <=i -1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap = 1;
                }
            }
            if (swap == 0){
                break;
            }
        }
        return arr;
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
