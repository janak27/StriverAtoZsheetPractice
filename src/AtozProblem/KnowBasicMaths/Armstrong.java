package AtozProblem.KnowBasicMaths;

public class Armstrong {
    public static void main(String[] args) {

        int no = 153;
        int n = no;
        int temp = no;
        int count  = 0;

        while(temp != 0){
            count++;
            temp = temp / 10;
        }
        int sum = 0;

        while(n !=0){
            int digit = n %10;
            sum = sum + (int) Math.pow(digit,count);
            n = n/10;
        }

        if (sum == no){
            System.out.println("number is armstrong : " + no);
        }
        else {
            System.out.println("not armstrong");
        }

    }
}
