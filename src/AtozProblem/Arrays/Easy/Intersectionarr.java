package AtozProblem.Arrays.Easy;

import java.util.Arrays;
import java.util.HashSet;

public class Intersectionarr {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {3,4,5,6};

        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();

        for (int j : nums1) {
            hs.add(j);
        }
        for (int j : nums2) {
            if (hs.contains(j))
                hs1.add(j);
        }
        int[] answer = new int[hs1.size()];
        int i = 0;
        for (int num : hs1) {
            answer[i++] = num;
        }
        System.out.println(Arrays.toString(answer));

    }
}
