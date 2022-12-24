package LinearSearch;

public class SearchinStrings {
    public static void main(String[] args) {
        String name = "Janak";
        char target = 'k';
        System.out.println(search(name,target));
    }
    static boolean search(String name, char target){
        if (name.length() == 0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)){
                System.out.println(i);
                return true;
            }
        }
    return false;
    }

}
