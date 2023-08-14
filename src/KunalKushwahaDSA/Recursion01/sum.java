package KunalKushwahaDSA.Recursion01;

public class sum {
    public static void main(String[] args) {
        System.out.println(sumofdigit(545454));
    }
    static int sumofdigit(int n){
        if (n==0) return 0;
        return (n%10) + sumofdigit(n/10);
    }

}
