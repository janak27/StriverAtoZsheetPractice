package KunalKushwahaDSA.Recursion01;

public class prodofdig {
    public static void main(String[] args) {
        System.out.println(prod(5555));

    }
    static int prod(int i){
        if(i % 10 == i){
            return i;
        }
        return prod(i/10) * (i % 10);
    }
}
