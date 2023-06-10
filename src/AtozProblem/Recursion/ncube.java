package AtozProblem.Recursion;

public class ncube {
    public static void main(String[] args) {
        int n  = 5;
        int sum = 0;
        System.out.println(sumofcube(n));


    }
    public static int sumofcube(int n){
        if (n < 1){
            return 0;
        }
        return (int) (Math.pow(n,3) + sumofcube(n-1));
    }
}
