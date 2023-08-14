package KunalKushwahaDSA.Recursion01;

public class fact {
    public static void main(String[] args) {
        System.out.println(fact(6));
    }

    static int fact(int i){

        if (i <= 1){
            return 1;
        }
        return i + fact(i-1);
    }

}

