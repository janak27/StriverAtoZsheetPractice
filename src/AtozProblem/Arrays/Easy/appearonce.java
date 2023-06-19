package AtozProblem.Arrays.Easy;

public class appearonce {
    public static void main(String[] args) {
        int[] A = {1, 1, 2, 5, 5};
        int N = A.length;
        int result = 0;
        for (int i = 0; i < N; i++) {
            result ^= A[i];
        }
        System.out.println(result);
    }
}
