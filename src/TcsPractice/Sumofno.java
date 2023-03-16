package TcsPractice;

import java.util.Scanner;

public class Sumofno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int rem = 0;
        int sum = 0;
        while (num != 0){
            rem = num % 10;
            num = num / 10;
            sum = sum + rem;
        }
        System.out.println(sum);
        if (sum%3==0){
            System.out.println("TRUE");
        }
    }
}
