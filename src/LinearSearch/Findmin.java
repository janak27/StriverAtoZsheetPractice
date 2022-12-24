package LinearSearch;

public class Findmin {
    public static void main(String[] args) {
        int[] arr = {12,45,36,2,11,33,55,1,47,65,15,63,78};
        System.out.println(min(arr));
        System.out.println(max(arr));

    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    static int max(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }

}
