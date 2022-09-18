package tcssheet;

public class gcd {
    public static void main(String[] args) {
        int a = 18; int b = 12;
        System.out.println(gcdom(a,b));
    }

     static int gcdom(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;

        if(a==b) return a;
        if (a > b)
            return gcdom(a-b, b);
        return gcdom(a, b-a);
    }
}
