package KunalKushwahaDSA.Recursion01;

public class hellorecursion {
    public static void main(String[] args) {
        message(5);
    }
    public static void message(int a){
        // recursive call
        if(a > 0){
            System.out.println(a);
            message(a-1);
        }
        //base condition
        if(a <= 0){
            return;
        }
    }
}
