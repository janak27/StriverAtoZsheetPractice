package LinearSearch;

public class main {
    public static void main(String[] args) {
        System.out.println("JAI SHREE MOHARATADEVI MATA <3 ");
        int[] arr = {4,7,8,3,2,5};
        int key = 3;
        System.out.println(linearsearch(arr,key));
    }

    static int linearsearch(int[] arr,int key){
        if (arr.length == 0){
            System.out.println("array is empty");
            return -1;
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    System.out.println("the position of key is "+ i);
                }
            }
        }
        return -1;
    }
}
