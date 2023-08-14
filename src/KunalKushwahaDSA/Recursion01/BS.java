package KunalKushwahaDSA.Recursion01;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,8,9,11,12,13,17,19};
        int key = 8;
        System.out.println(search(arr,key,0,arr.length));
    }
    static int search(int[] arr, int key, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if(arr[m] == key){
            return m;
        }
        if (key < arr[m]){
            return search(arr,key,s,m-1);
        }
        return search(arr,key,m+1,e);

    }
}
