package LinearSearch;

public class main {
    public static void main(String[] args) {
        int[] arr = {4, 7, 8, 3, 2, 5};
        int target = 3;
        System.out.println(linearsearch(arr, target));
    }
    static int linearsearch(int[] arr,int target){
        if (arr.length == 0){
            System.out.println("array is empty");
            return -1;
        }
        else{
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] == target) {
                    System.out.println("the position of target is "+ index);
                    return index;
                }
            }
        }
        return -1;
    }
}
