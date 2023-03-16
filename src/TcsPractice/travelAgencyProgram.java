package TcsPractice;
import java.util.*;
public class travelAgencyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelAgencies[] arr = new TravelAgencies[4];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            boolean e = sc.nextBoolean();
            sc.nextLine();
            arr[i] = new TravelAgencies(a,b,c,d,e);
        }

        int inputregno = sc.nextInt();
        sc.nextLine();
        String inputpackage = sc.nextLine();

        int result1 = findAgencyWithHighestPackagePrice(arr);
        System.out.println(result1);

        TravelAgencies result2 = agencyDetailsForGivenldAndType(arr, inputregno, inputpackage);
        System.out.println(result2.agencyName + ':' + result2.price);


    }

    public  static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr){
        int max = arr[0].price;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].price > max){
                max = arr[i].price;
            }
        }
        return max;
    }

    public static  TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies[] arr, int regno, String packageType){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].flightFacility == true){
                if (arr[i].regNo == regno && arr[i].packageType.equals(packageType)){
                    return arr[i];
                }
            }
        }

        return null;
    }
}

class TravelAgencies {
    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
}
