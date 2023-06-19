package AtozProblem.Arrays.Easy;

import java.util.HashMap;

public class subarraywithsum {
    public static void main(String[] args) {
        int[] A = {10, 5, 2, 7, 1, 9};
        int K = 15;
        int N = A.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int maxLen=0;
        for(int i=0;i< N;i++)
        {
            sum+=A[i];
            if(sum==K)
            {
                maxLen=Math.max(i+1,maxLen);
            }
            if(map.containsKey(sum-K))
            {
                int len=i-map.get(sum-K);
                maxLen=Math.max(maxLen,len);
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
        }
        System.out.println(maxLen);
    }
}
