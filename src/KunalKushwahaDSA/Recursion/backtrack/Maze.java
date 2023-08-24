package KunalKushwahaDSA.Recursion.backtrack;

import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {
//        ArrayList<String> ans = new ArrayList<>();
//        System.out.println(pathd("",3,3, ans));
//        System.out.println(pathdwithDiag("",3,3));
        boolean[][] maze = {
                {true, true,true},
                {true, true,true},
                {true, true,true}
        };
        pathobs("",maze,0,0);
    }

    static void pathobs(String p, boolean[][] maze, int r, int c){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if (r < maze.length - 1){
            pathobs(p + 'D', maze,r + 1, c);
        }

        if (c < maze[0].length - 1){
            pathobs(p + 'R', maze,r , c + 1);
        }

        if ( r > 0){
            pathobs(p+'U',maze, r- 1, c);
        }

        if ( c > 0){
            pathobs(p+'L',maze, r, c - 1);
        }

        maze[r][c] = true;


    }

    static ArrayList<String> pathdwithDiag(String p, int r, int c){
        if (r == 1  && c == 1){
//            System.out.println(p);
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> ans = new ArrayList<>();
        if (r > 1 && c > 1){
            ans.addAll(pathdwithDiag(p+'D', r-1, c-1));
        }
        if ( r > 1){
            ans.addAll(pathdwithDiag(p+'V' , r - 1, c));
        }
        if ( c > 1){
            ans.addAll(pathdwithDiag(p+'H' , r , c - 1));
        }
        return ans;
    }

    static int countPath(int r, int c){
        if (r == 1   || c == 1){
            return 1;
        }
        int left = countPath(r - 1,c);
        int right = countPath(r, c-1);
        return left + right;
    }

    static ArrayList<String> pathd(String p, int r, int c, ArrayList<String> ans){
        if (r == 1  && c == 1){
//            System.out.println(p);
            ans.add(p);
            return ans;
        }
        if ( r > 1){
            pathd(p+'D' , r - 1, c, ans);
        }
        if ( c > 1){
            pathd(p+'R' , r , c - 1, ans);
        }
        return ans;
    }

    static ArrayList<String> pathdwith(String p, int r, int c){
        if (r == 1  && c == 1){
//            System.out.println(p);
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> ans = new ArrayList<>();
        if ( r > 1){
            ans.addAll(pathdwith(p+'D' , r - 1, c));
        }
        if ( c > 1){
            ans.addAll(pathdwith(p+'R' , r , c - 1));
        }
        return ans;
    }


}
