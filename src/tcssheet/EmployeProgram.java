package tcssheet;
import java.util.*;
public class EmployeProgram {
    public static void main(String[] args) {
        Employee[] arr = new Employee[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            boolean e = sc.nextBoolean();
            sc.nextLine();
            arr[i] = new Employee(a,b,c,d,e);
        }
        String in1 =sc.nextLine();
        int result1 = findCountOfEmployeesUsingCompTransport(arr,in1);
        if(result1==0){
            System.out.println("na");
        }
        System.out.println(result1);

        Employee[] result2 = EmployeeWithSecondHighestRating(arr);
        if(result2!=null)
        {
            for (int i = 0; i < result2.length - 1; i++) {
                    System.out.println(result2[i].employeeId);
                    System.out.println(result2[i].name);
            }
        }
        else
        {
            System.out.println("All Employees using company transport");
        }
    }

    static Employee[] EmployeeWithSecondHighestRating(Employee[] arr){
        Employee[] obj = new Employee[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].transport == false){
                obj = Arrays.copyOf(obj,obj.length+1);
                obj[obj.length-1] = arr[i];
            }
        }
        Employee temp;
        for (int i = 0; i < obj.length; i++) {
            for (int j = i+1; j < obj.length; j++) {
                if(obj[i].rating > obj[j].rating){
                    temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }
        }
        if(obj.length==0){
            return null;
        }
        return obj;
    }

    static int findCountOfEmployeesUsingCompTransport( Employee[] arr, String in1){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].branch.equalsIgnoreCase(in1)){
                if(arr[i].transport){
                    count = count + 1;
                }
            }
        }
        if (count!= 0){
            return count;
        }
        return 0;
    }
}

class Employee{
    int employeeId;
    String name;
    String branch;
    double rating;
    boolean transport;

    public Employee(int employeeId, String name, String branch, double rating, boolean transport) {
        this.employeeId = employeeId;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.transport = transport;
    }
}
