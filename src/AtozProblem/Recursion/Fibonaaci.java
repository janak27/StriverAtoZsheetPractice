package AtozProblem.Recursion;

public class Fibonaaci {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i < n; i++){
            System.out.print(Fibo(i) +" ");
        }

    }
    static int Fibo(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return Fibo(n-2) + Fibo(n-1);
    }
    }

