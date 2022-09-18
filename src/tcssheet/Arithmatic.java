package tcssheet;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the n");
        int n = sc.nextInt();
        System.out.println(" enter the a");
        float a = sc.nextInt();
        System.out.println(" enter the d");
        float d = sc.nextInt();

        System.out.println(sumofap(n,a,d));
    }

    static float sumofap(int n, float a, float d) {
    float sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a;
            a = d + a;
            System.out.println(sum);
        }
        System.out.println("the sum is" + sum);
        return sum;
    }
}
