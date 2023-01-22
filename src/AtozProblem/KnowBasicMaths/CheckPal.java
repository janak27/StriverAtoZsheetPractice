package AtozProblem.KnowBasicMaths;

public class CheckPal {
    public static void main(String[] args) {
//        int num = 123456;
        int num = 123321;
        int dummy = num;
        int temp = 0;
        int reverse = 0;
        while (num > 0){
            temp = num % 10;
            num = num / 10;
            reverse = reverse*10 + temp;


        }
        System.out.println(reverse);
        System.out.println(num);
        System.out.println(dummy);
        if (dummy==reverse){
            System.out.println("it is palindrome");
        }
        else {
            System.out.println("nahhhhh");
        }
    }
}
