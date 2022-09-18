package tcssheet;

public class reversedigit {
    public static void main(String[] args)
    {
        int num = 4562;
        System.out.println("the sum is "+sumof(num));
        System.out.println("Reverse of no. is "
                + reverseDigits(num));
    }

    static int sumof(int num) {
        int sum = 0;
        while (num!=0){
            sum = sum + num%10;
            num = num/10;
        }

        return sum;
    }

    private static int reverseDigits(int num) {

        int rev = 0;
        while (num > 0){
            rev = num % 10 + rev * 10;
//            System.out.println("rev is "+rev);
//            System.out.println("num is "+num);
            num = num / 10;
        }
        return rev;
    }
}
