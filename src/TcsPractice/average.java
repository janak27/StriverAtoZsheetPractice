package TcsPractice;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] =sc.nextInt();
//        }
//        int ptr1 = sc.nextInt();
        int ptr1 = 2;
        int ptr2 = 6;
        int sum = 0;
        int counter = 0;
        for (int j : arr) {
            if (j > ptr1 && j < ptr2) {
                sum = sum + j;
                counter++;
            }
        }
        int avg = sum / counter;
        System.out.println(avg);

    }
}
