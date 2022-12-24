package LinearSearch;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {12,45,36,2,11,33,55,1,47,65,15,63,78};
        int ans = linearsearch(arr,47,1,8);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr,int target, int start, int end){
        if (arr.length == 0){
            System.out.println("array is empty");
            return -1;
        }
        else{
            for (int index = start; index <= end; index++) {
                if (arr[index] == target) {
                    System.out.println("the position of target is "+ index);
                    return index;
                }
            }
        }
        return -1;
    }
}
