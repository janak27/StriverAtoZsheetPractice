package KunalKushwahaDSA.Recursion.str;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        System.out.println(perm3("","abc"));
    }

    static int perm3(String p, String up){
        if (up.isEmpty()){
            System.out.print(p + " ");
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length()  ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + perm3(f+ch+s , up.substring(1));
        }
        return count;
    }

    static ArrayList<String> perm2(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans =  new ArrayList<>();
        for (int i = 0; i <= p.length()  ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(perm2(f+ch+s , up.substring(1)));
        }
        return ans;
    }

    static void perm(String p, String up){
        if (up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length()  ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            perm(f+ch+s , up.substring(1));
        }
    }
}
