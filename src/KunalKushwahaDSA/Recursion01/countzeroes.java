package KunalKushwahaDSA.Recursion01;

public class countzeroes {
    public static void main(String[] args) {
        int ans = count(40405060);
        System.out.println(ans);
    }
    public static int count(int i){
        return help(i,0);
    }
    public static int help(int i, int c){
        if (i==0) return c;
        int rem = i % 10;
        if (rem == 0){
            return help(i/10, c+1);
        }
        return help(i/10,c);
    }
}
