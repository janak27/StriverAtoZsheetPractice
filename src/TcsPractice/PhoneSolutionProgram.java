package TcsPractice;
import java.util.*;
public class PhoneSolutionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] arr = new Phone[4];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            arr[i] = new Phone(a,b,c,d);
        }
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        int result1 = findPriceForGivenBrand(arr,input1);
        if(result1!=0){
            System.out.println(result1);
        }
        else{
            System.out.println("The given Brand is not available");
        }

        Phone result2 = getPhoneIdBasedOnOs(arr,input2);
        if(result2 != null){
            System.out.println(result2.phoneId);
        }
        else {
            System.out.println("No phones are available with specified os and price range");
        }

    }

    static Phone getPhoneIdBasedOnOs(Phone[] arr, String input2){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].os.equalsIgnoreCase(input2)){
                return arr[i];
            }
        }
        return null;
    }
    static int findPriceForGivenBrand(Phone[] arr,String input1){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].brand.equalsIgnoreCase(input1)){
                sum  =  sum + arr[i].price;
            }
        }
        if(sum == 0){
            return 0;
        }
        return sum;
    }

}

class Phone{
    int phoneId;
    String os;
    String brand;
    int price;
    Phone(int phoneId,String os,String brand, int price){
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }
}
