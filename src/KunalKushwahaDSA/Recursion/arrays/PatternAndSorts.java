package KunalKushwahaDSA.Recursion.arrays;

public class PatternAndSorts {
    public static void main(String[] args) {
        fun1(5,0);
    }

    static void fun1(int r, int c){
        if(r==0){
            return;
        }

        if(c < r){
            System.out.print("*");
            fun1(r, c+1);
            System.out.print("*");

        }
        else {
            System.out.println();
            fun1(r-1,0);
            System.out.println();

        }
    }
}
