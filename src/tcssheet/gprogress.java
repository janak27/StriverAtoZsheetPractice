package tcssheet;

public class gprogress {
    public static void main(String[] args) {
            float a = 2; // first term
            float r = 2; // common ratio
            int n = 15; // number of terms
            System.out.println((int)(sumOfGP(a, r, n)));
}

    static float sumOfGP(float a, float r, int n) {
        return ( a * (1 - (int)(Math.pow(r,n))))/(1-r);
    }
}
