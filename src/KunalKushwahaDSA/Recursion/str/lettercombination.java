package KunalKushwahaDSA.Recursion.str;

import java.util.ArrayList;
import java.util.List;

public class lettercombination {
    public static void main(String[] args) {
        String a = "26";
        System.out.println(letterCombinations(a));
    }

    public static List<String> letterCombinations(String digits) {

        if(digits.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        String[] s = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> list = new ArrayList<>();

        letterComb("",digits,s,list);
        return list;
        // List<String> ans = solve("",digits);
        // return ans;
    }
    public static void letterComb(String temp, String digits, String[] s , List<String> list){
        if(digits.isEmpty()){
            list.add(temp);
        }
        else{
            String str = s[digits.charAt(0) - '2'];
            for(char ch : str.toCharArray()){
                letterComb(temp + ch, digits.substring(1),s, list);
            }
        }
    }

    public static List<String> solve(String ans, String ip) {
        if(ip.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        int digit = ip.charAt(0) - '0';
        int i=(digit-2)*3;
        if(digit > 7) {
            i+=1;
        }
        int len = i+3;
        if(digit == 7 || digit == 9) {
            len+=1;
        }
        ArrayList<String> list = new ArrayList<>();
        for(; i<len; i++) {
            char ch = (char)('a' + i);
            list.addAll(solve(ans+ch, ip.substring(1)));
        }
        return list;
    }
}
