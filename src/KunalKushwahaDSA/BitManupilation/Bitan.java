package KunalKushwahaDSA.BitManupilation;

public class Bitan {
    public static void main(String[] args) {
        int n = 86;
//        System.out.println(isoddd(n));
        int[] arr = { 2,2,4,4,5,5,6,7,7};
        System.out.println(uni(arr));
    }

    private static int uni(int[] arr) {
        int uniqu = 0;
        for (int n : arr) {
            uniqu = uniqu ^ n;
        }
        return uniqu;
    }

    private static boolean isoddd(int i) {
        return (i & 1) == 1;
    }
}
