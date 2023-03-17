package tcssheet;
import  java.util.*;
public class HotelProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] arr = new Course[4];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            int e = sc.nextInt();sc.nextLine();
            arr[i] = new Course(a,b,c,d,e);
        }

        String in1 = sc.nextLine();
        int in2 = sc.nextInt(); sc.nextLine();
        int result1 = findAvgOfQuizByAdmin(arr,in1);
        if (result1==0){
            System.out.println("na");
        }
        System.out.println(result1);
        Course[] result2 = sortCourseByHandsOn(arr,in2);
        assert result2 != null;
        if(result2.length == 0){
            System.out.println("na");
        }
        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i].courseName);
        }
    }

    static Course[] sortCourseByHandsOn(Course[] arr, int in2){
        Course[] obj = new Course[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].handson < in2) {
                obj = Arrays.copyOf(obj, obj.length + 1);
                obj[obj.length - 1] = arr[i];
            }
        }
        Course temp;
        for (int i = 0; i < obj.length; i++) {
            for (int j = i+1; j < obj.length; j++) {
                if(obj[i].handson > obj[j].handson){
                    temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }
        }
        if (obj.length > 0){
            return obj;
        }
        return null;
    }



    static  int findAvgOfQuizByAdmin(Course[] arr,String in1){
        int sum = 0;
        int n = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            if(in1.equalsIgnoreCase(arr[i].courseAdmin)){
                n = n + 1;
                sum = sum + arr[i].quiz;
            }
        }
        if (n==0){
            return 0;
        }
        avg = sum/n;
        return avg;
    }
}


class Course{
    int courseId;
    String courseName;
    String courseAdmin;
    int quiz;
    int handson;

    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

}
