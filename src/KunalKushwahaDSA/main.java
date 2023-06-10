package KunalKushwahaDSA;

public class main {
    public static void main(String[] args) {
//        printing numbers
        int n = 0;
    printnum(n);
    }

    static void printnum(int n) {
        System.out.println(n);
        if(n == 8){
            return;
        }
        printnum(n+1);
    }
}
