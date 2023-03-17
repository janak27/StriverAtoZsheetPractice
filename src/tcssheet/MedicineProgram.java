package tcssheet;
import java.util.*;


public class MedicineProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicine[] arr = new Medicine[4];
        for (int i = 0; i < arr.length ; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            arr[i] = new Medicine(a,b,c,d);
        }
        String in1 = sc.nextLine();
        int[] result1 = getPriceByDisease(arr,in1);
        if(result1==null){
            System.out.println("na");
        }
        for (int i = 0; i < result1.length; i++) {
            System.out.println(result1[i]);
        }

    }

    static int[] getPriceByDisease(Medicine[] arr, String in1){
        int[] po = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].disease.equalsIgnoreCase(in1)){
            po = Arrays.copyOf(po,po.length+1);
            po[po.length-1] = arr[i].price;
            }
        }
        Arrays.sort(po);
        if(po == null){
            return null;
        }
        return po;
    }

}

class Medicine{
    String medicineName;
    String batch;
    String disease;
    int price;

    public Medicine(String medicineName, String batch, String disease, int price) {
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }
}
