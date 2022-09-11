package StepOne;

public class RecursionPractice {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr.length/2);
//        reversearr(0,arr.length-1,arr);
//        reversearr2(0,arr.length,arr);
//        System.out.println(Arrays.toString(arr));

//string palindrone
        int[] arr = {1,2,3,5,1};
        System.out.println(checkPalindrone(0, arr));
    }

    static boolean checkPalindrone( int i,int[] arr) {
        if(i >= arr.length/2) return true;
        if (arr[i] != arr[arr.length-i-1]) return false;
        return checkPalindrone(i + 1,arr);
    }

    private static void reversearr2(int i, int n, int[] arr) {
        if (i >= n/2) return;
        int temp;
        temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reversearr2(i+1,n,arr);

    }

    static void reversearr(int l, int r , int[] arr) {
        if (l>=r) return;
        int temp;
        temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reversearr(l+1,r-1,arr);
    }



    private static void factor2(int n, int fact) {
        if (n==1){
            System.out.println(fact);
            return;
        }
        factor2(n-1, fact*n);

    }

    private static int factor(int n) {
        if(n==0) return 1;
        return n* factor(n-1);
    }

    private static int sumofonetonfunctional(int n) {
        if (n==0) {
            return 0;
        };
        return n + sumofonetonfunctional(n-1);
    }

    private static void sumofoneton(int i, int sum) {//parameterized recursion
        if (i<1) {
            System.out.println(sum);
            return;}
        sumofoneton(i-1,sum+i);
    }

    static void recusionBacktrack(int n1, int n2) {
        if(n1<1) return;
        recusionBacktrack(n1-1,n2);
         System.out.println(n1);
    }

    static void recusionBacktrack3(int n1, int n2) {
        if(n1>n2) return;
        recusionBacktrack3(n1+1,n2);
        System.out.println(n1);
    }

    static void recusionBacktrack2(int n1, int n2) {
        if ( n1 == 0) return;
        recusionBacktrack2(n1-1,n2);
        System.out.println(n2-n1+1);
    }


    static void recursionntone(int i, int n) {
        if(i>n) return;
        System.out.println(n+1 - i);
        recursionntone(i+1,n);
    }

    static void recursiononeton(int i, int n) {
        if(i>n) return;
        System.out.println(i);
        recursiononeton(i+1,n);
    }

    static void recusionprintname(int i, int n, String name) {
        if(i>n) return;
        System.out.println(name);
        recusionprintname(i+1,n,name)
        ;
    }

    static void recursion(int i, int n) {
        if(i>n) return;
        System.out.println("a");
        recursion(i+1,n);
    }

}
