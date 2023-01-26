package AtozProblem.Recursion;

public class PrintNtimes {
    public static void main(String[] args) {
        int n = 10;
//        Recursion(n);
        Recursion2(n,1);
    }

    private static void Recursion2(int n, int i) {
        if( i <= n ){
            System.out.println(i);
            i++;
            Recursion2(n,i);
        }
        else{
            return;
        }
    }


    static int Recursion(int n) {
        if (n == 0){
            return 0;
        }
        else{
            System.out.println(n);
            Recursion(n-1);
        }
        return 0;
    }
}
