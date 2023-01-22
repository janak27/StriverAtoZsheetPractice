package AtozProblem.KnowBasicMaths;

public class Count {
//    count digits in number;
//    count even digits
//    count odd digits
public static void main(String[] args) {
    int num = 123456;
    int count = 0;
    int even = 0;
    int odd = 0;
    while(num !=0){
        num = num / 10;
        count++;
        if(num%2==0){
            even++;
        }
        else{
            odd++;
        }
    }
    System.out.println(count);
    System.out.println("even count :"+ even);
    System.out.println("odd count :"+ odd);
}
}
