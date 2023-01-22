package AtozProblem.KnowBasicMaths;

public class Reversenum {
    public static void main(String[] args) {
        int num = 123456;
        int temp = 0;
        int reverse = 0;
        while (num > 0){
            temp = num %10;
            num = num / 10;
            reverse = reverse*10 + temp;
        }
        System.out.println(reverse);
    }
}
