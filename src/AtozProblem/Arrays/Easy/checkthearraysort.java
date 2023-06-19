package AtozProblem.Arrays.Easy;

public class checkthearraysort {
    public static void main(String[] args) {
        int[] arr = {5,8,7,9,3,6,4,1};
        boolean sorted = true;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= arr[i-1]){
                sorted = true;
            }
            else{
                sorted = false;
            }
        }
        System.out.println(sorted);

    }
}
