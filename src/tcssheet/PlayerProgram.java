package tcssheet;

import java.util.*;
public class PlayerProgram {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Player[] arr = new Player[4];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            arr[i] = new Player(a,b,c,d);
        }
        String in1 = sc.nextLine();
        String in2 = sc.nextLine();
        int result1 = findPointsForGivenSkill(arr,in1);
        System.out.println(result1);
        Player result2 = getPlayerBasedOnLevel(arr,in1,in2);
        if(result2 == null){
            System.out.println("na");
        }

        System.out.println(result2.playerId);

    }

    public static Player getPlayerBasedOnLevel(Player[] arr,String in1,String in2)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].skill.equalsIgnoreCase(in1)){
                if(arr[i].level.equalsIgnoreCase(in2)){
                    if (arr[i].points >= 20){
                        return arr[i];
                    }
                }
            }
        }
        return null;
    }
    public static int findPointsForGivenSkill(Player[] arr, String in1){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].skill.equalsIgnoreCase(in1)){
                sum += arr[i].points;
            }
        }
        if(sum==0) {
            return 0;
        }
        return sum;
    }
}

class Player{
    int playerId;
    String skill;
    String level;
    int points;
    Player(int playerId,String skill,String level, int points){
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }
}
