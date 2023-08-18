package KunalKushwahaDSA.Recursion.arrays;

import java.util.ArrayList;

public class recursionarr {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,3,4,5};
        System.out.println(rotatedBS(arr,4,0,arr.length - 1));
//        System.out.println(sorted(arr,0));
//        System.out.println(linear(arr,18,0,arr.length));

//        System.out.println(find(arr,7,0,new ArrayList<>()));
    }

    static int rotatedBS(int[] arr, int target, int s, int e){
        if ( s > e){
            return -1;
        }
        int m = s + (e - s)/2;
        if (arr[m] == target){
            return m;
        }

        if(arr[s] <= arr[m]){
            if (target > arr[s] && target<= arr[m]){
                return rotatedBS(arr,target,s,m-1);
            }
            else {
                return rotatedBS(arr,target,m+1,e);
            }
        }
        if (target >= arr[m] && target <= arr[e]){
            return rotatedBS(arr,target,m+1,e);
        }
        return rotatedBS(arr,target,s, m-1);
    }

    static ArrayList<Integer> find(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return find(arr,target,index+1,list);
    }

    static int linear(int[] arr, int key, int start, int end) {
        if( start == end){
            return 0;
        }
        if(arr[start] == key){
            return start;
        }
        return linear(arr,key,start + 1, end);
    }

    static boolean sorted(int[] arr, int index){
        if (index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr,index+1);
    }
}
