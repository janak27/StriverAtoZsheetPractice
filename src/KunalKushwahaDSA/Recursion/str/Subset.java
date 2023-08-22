package KunalKushwahaDSA.Recursion.str;
import java.util.*;

public class Subset {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> ans = subsets(nums);
        System.out.println(ans);



    }
    public static List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        generateSubset2(0, nums, new ArrayList<>(), list);
        return list;
    }


    public static void generateSubset(int index, int[]nums, List<Integer> current, List<List<Integer>> list){
        list.add(new ArrayList<>(current));
        System.out.println(current);
        for(int i = index; i < nums.length; i++){
            current.add(nums[i]);
            generateSubset(i+1, nums, current, list);
            current.remove(current.size()-1);
        }
    }

    public static void generateSubset2(int index, int[] nums, List<Integer> current, List<List<Integer>> list){
        list.add(new ArrayList<>(current));
//        System.out.println(current);
        for(int i = index; i < nums.length; i++){
            current.add(nums[i]);
            if(!list.contains(current)){
                generateSubset2(i+1, nums, current, list);
            }
            current.remove(current.size()-1);
        }
    }

    static List<List<Integer>> subsetwithoutrecursion(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    static List<List<Integer>> subsetwithoutrecursionduplicates(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                if(!outer.contains(internal)){
                    outer.add(internal);
                }
            }
        }
        return outer;
    }
}
