package KunalKushwahaDSA.Strings;

public class main {
    public static void main(String[] args) {
        String ans  = removeOuterParentheses("(()())(())");
        System.out.println(ans);
    }
    public static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();

        int open = 0;

        for( char c : s.toCharArray()){
            System.out.println(open);
            if(c == '(' ){
                if(open > 0){
                    ans.append(c);
                }
                open++;
            }
            if(c == ')'){
                if(open > 1){
                    ans.append(c);
                }
                open--;
            }
        }
        String m = ans.toString();
        return m;
    }
}
