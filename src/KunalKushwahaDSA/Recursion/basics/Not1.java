package KunalKushwahaDSA.Recursion.basics;

public class Not1 {
    public static void main(String[] args) {
        print(5);
    }
//    static void print(int i){
//        if (i == 0){
//            return;
//        }
//        System.out.println(i);
//        print(i-1);
//    }

    static void print(int i){
        if (i == 0){
            return;
        }
        print(i-1);
        System.out.println(i);

    }

}
