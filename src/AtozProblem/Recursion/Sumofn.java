package AtozProblem.Recursion;

public class Sumofn {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        Sum(n,1,sum);

    }
     static void Sum(int n, int i, int sum){
        if(i <= n){
            sum = sum + i;
            i++;
            System.out.println(sum);
            Sum(n,i,sum);
        }
        else{
            return;
        }

    }
}
