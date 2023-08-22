package KunalKushwahaDSA.Recursion.str;

public class removeletter {
    public static void main(String[] args) {
        String s = skip("appleappappleappppa");
        System.out.println(s);
    }

    static String skip(String test){
        if (test.isEmpty()){
            return "";
        }

        String x = "apple";
        String y = "app";

        if (test.startsWith(y) &&  !test.startsWith(x)){
            return skip(test.substring(y.length()));
        }
        else {
            return test.charAt(0)  + skip(test.substring(1));
        }
    }

//    static String skip(String test){
//        if (test.isEmpty()){
//            return "";
//        }
//
//        String x = "apple";
//
//        if (test.startsWith(x)){
//            return skip(test.substring(5));
//        }
//        else {
//            return test.charAt(0)  + skip(test.substring(1));
//        }
//    }

//    static void skip(String p, String up){
//        if (up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        char ch = up.charAt(0);
//
//        if (ch == 'a'){
//            skip(p,up.substring(1));
//        }
//        else {
//            skip(p+ch,up.substring(1));
//        }
//    }

//    static String skip( String up){
//        if (up.isEmpty()){
//
//            return up;
//        }
//
//        char ch = up.charAt(0);
//
//        if (ch == 'a'){
//             return skip(up.substring(1));
//        }
//        else {
//            return  ch + skip(up.substring(1));
//        }
//    }
}
