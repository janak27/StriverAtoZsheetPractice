package tcssheet;
import java.util.*;

public class charcount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = "aabbbccc";

        int count = 0;
        char ch = s.charAt(0);
        for (int k = 0; k < s.length(); k++)
        {
            if(ch==s.charAt(k))
            {
                count++;
            }
            else{
                System.out.println(ch+""+count);
                ch = s.charAt(k);
                count =0;
                k--;
            }
            if(ch == s.charAt(s.length()-1) && k==s.length()-1)
            {
                System.out.println(ch+""+count);
            }

        }
    }
}

