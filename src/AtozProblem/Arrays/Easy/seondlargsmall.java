package AtozProblem.Arrays.Easy;

public class seondlargsmall {
    public static void main(String[] args) {
        int[] arr = {5,8,7,9,3,6,4,1};
        System.out.println(print2largest(arr,arr.length) + " " + print2smallest(arr,arr.length));
    }
    static int print2largest(int[] arr, int n) {
        int biggest = Integer.MIN_VALUE;
        int biggest2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > biggest){
                biggest2 = biggest;
                biggest = arr[i];
            }
            else if (arr[i] > biggest2 && arr[i] != biggest){
                biggest2 =arr[i];
            }
        }
        return biggest2;
    }

    static int print2smallest(int[] arr, int n) {
        // code here
        int smallest = Integer.MAX_VALUE;
        int smallest2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest){
                smallest2 = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < smallest2 && arr[i] != smallest){
                smallest2 =arr[i];
            }
        }
        return smallest2;

    }
}
