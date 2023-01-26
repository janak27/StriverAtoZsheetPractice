package AtozProblem.Recursion;

public class Palindrone {
    public static void main(String[] args) {
         String s = "JANAKKANAJ";
         int l = 0;
         int r = s.length() - 1;
         Pal(l,r,s);
    }

    static boolean Pal(int l, int r, String s){
        if (l<r){
            if (s.charAt(l)==s.charAt(r)){
                System.out.println(s);
                l++;
                r--;
                Pal(l,r,s);
            }
            else {
                System.out.println("not pal");
                return false;
            }
        }
        else{
            System.out.println(" it is pal");
            return true;
        }
        return true;


    }
}
