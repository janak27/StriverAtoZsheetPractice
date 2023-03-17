package TcsPractice;
import java.util.*;

public class footwearProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Footwear[] arr = new Footwear[5];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            arr[i] = new Footwear(a,b,c,d);
        }

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        int result1 = getCountByType(arr,input1);
        if (result1 == 0){
            System.out.println("not availabale footware");
        }
        System.out.println(result1);

        Footwear object = getSecondHighestPriceByBrand(arr,input2);
        if (object == null){
            System.out.println("brand not");
        }
        assert object != null;
        System.out.println(object.footwearId);
        System.out.println(object.footwearName);
        System.out.println(object.price);

    }

    static Footwear getSecondHighestPriceByBrand(Footwear[] arr, String input2){
        int[] obj = new int[0];
        for (Footwear footwear : arr) {
            if (footwear.footwearName.equalsIgnoreCase(input2)) {
                obj = Arrays.copyOf(obj, obj.length + 10);
                obj[obj.length - 1] = footwear.price;
            }

        }

        Arrays.sort(obj);
        if (obj.length > 0){
            int secondhigh = obj[obj.length - 2];
            for (Footwear footwear : arr) {
                if (footwear.price == secondhigh) {
                    return footwear;
                }
            }
        }
        return null;
    }






    static int getCountByType(Footwear[] arr, String input1){
        int count = 0;
        for (Footwear footwear : arr) {
            if (footwear.footwearType.equalsIgnoreCase(input1)) {
                count = count + 1;
            }
        }
        return count;
    }


}

class Footwear {
    int footwearId;
    String footwearName;
    String footwearType;
    int price;

    public Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }
}