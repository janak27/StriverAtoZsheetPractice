package AtozProblem.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class unionarr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        ArrayList<Integer> ans = new ArrayList<>();

        int i=0;
        int j=0;
        int n = arr1.length;
        int m = arr2.length;
        int prev=-1;
        while(i<n&&j<m){
            if(arr1[i] <arr2[j]){
                if(arr1[i]!=prev)
                    ans.add(arr1[i]);
                prev=arr1[i];
                i++;
            }
            else if(arr1[i]>arr2[j]){
                if(arr2[j]!=prev)
                    ans.add(arr2[j]);
                prev=arr2[j];
                j++;
            }
            else if(arr1[i]==arr2[j]){
                if(arr1[i]!=prev){
                    ans.add(arr1[i]);
                    prev=arr1[i];
                }
                i++;
                j++;
            }
        }
        while(i < n){
            if(arr1[i]!=prev){
                ans.add(arr1[i]);
                prev=arr1[i];
            }
            i++;
        }
        while(j<m){
            if(arr2[j]!=prev){
                ans.add(arr2[j]);
                prev=arr2[j];
            }
            j++;
        }
        System.out.println(Arrays.toString(new ArrayList[]{ans}));
    }
}
