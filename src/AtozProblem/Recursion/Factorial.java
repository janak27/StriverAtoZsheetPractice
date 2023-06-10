package AtozProblem.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int fact = 1;
        Facto(n,i,fact);
    }

    static void Facto(int n,  int i , int fact){
        if(i<=n){
            fact = fact * i;
            i++;
            System.out.println(fact);
            Facto(n,i,fact);
        }
        else{
            return;
        }
    }

}
