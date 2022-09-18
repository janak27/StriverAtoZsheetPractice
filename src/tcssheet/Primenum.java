package tcssheet;

public class Primenum {
    public static void main(String[] args) {
        int n = 50;
        printprime(n);
    }

    static void printprime(int n) {
        for (int i = 2; i <= n; i++) {
            if(isprime(i)){
                System.out.println(i + " ");
            }
        }
    }

    static boolean isprime(int n) {
        if(n<=1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
