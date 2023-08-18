package KunalKushwahaDSA.Recursion.basics;

public class revdig {
    public static void main(String[] args) {
        revdigi(4565);
        System.out.println(sum);
    }
    static  int sum = 0;
    static void revdigi(int n){
        if(n==0) {
            return ;
        }
        int rem = n %  10;
        sum = (sum * 10) + rem;
        revdigi(n/10);
//        System.out.println(sum);

    }
}
