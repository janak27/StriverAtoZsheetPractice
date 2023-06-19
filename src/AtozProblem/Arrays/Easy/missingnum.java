package AtozProblem.Arrays.Easy;

public class missingnum {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            sum = arr[i] + sum;
        }
        int p = n + 1;
        int total = (p*(p+1))/2;
        int miss = total - sum;
        System.out.println(miss);
    }
}
