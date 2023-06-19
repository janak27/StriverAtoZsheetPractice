package AtozProblem.Arrays.Easy;

public class largestelement {
    public int largest(int arr[], int n)
    {
        int max = arr[0];
        for(int i = 0; i < arr.length ;i++){
            if(arr[i]> max){
                max =arr[i];
            }
        }
        return max;
    }

}
