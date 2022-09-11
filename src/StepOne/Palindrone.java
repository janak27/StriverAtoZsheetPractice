package StepOne;

public class Palindrone {

//    125. Valid Palindrome
//    A phrase is a palindrome if, after converting all uppercase letters into lowercase
//    letters and removing all non-alphanumeric characters, it reads the same forward and backward.
//    Alphanumeric characters include letters and numbers.
//    Given a string s, return true if it is a palindrome, or false otherwise.

    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int len = s.length();
        int right = len-1;
        for(int i=0;i<len && right>i;i++){
            char c = s.charAt(i);
            while(!(97<=c && c<=122) && !(c>=48 &&c<=57)){
                i++;
                if(i==len || i == right) return true;
                c = s.charAt(i);
            }
            char d = s.charAt(right);
            while(right>i && !(97<=d && d<=122) && !(d>=48 && d<=57)){
                right--;
                d = s.charAt(right);
            }
            if(c!=d) return false;
            right--;
        }
        return true;
    }
}
