package KunalKushwahaDSA.Recursion.backtrack;

import java.util.ArrayList;
import java.util.Arrays;

public class ratinmaze {

    public static void main(String[] args) {

        int[][] m =  {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};

        int n = m.length;
        System.out.println(findPath(m,n));

    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        int[][] vis = new int[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(vis[i],0);
        }

        ArrayList<String> ans = new ArrayList<>();

        if(m[0][0] == 0){
            return ans;
        }

        pathobs(m,vis,ans,"",0,0);
        return ans;
    }
    static boolean isSafe(int r, int c, int[][] m, int[][] vis){
        if(r >=0  && c >=0 && r < m.length && c < m.length){
            if(m[r][c] == 1 && vis[r][c] != 1){
                return true;
            }
        }

        return false;
    }

    static void pathobs(int[][] m, int[][] vis , ArrayList<String> ans,String p,int r, int c){
        if(r == m.length - 1 && c == m.length - 1){
            ans.add(p);
            return;
        }

        vis[r][c] = 1;

        if(isSafe(r + 1,c, m, vis)){
            pathobs(m,vis,ans,p + 'D',r+1,c);
        }

        if(isSafe(r,c +1 , m, vis)){
            pathobs(m,vis,ans,p + 'R',r,c+1);
        }

        if(isSafe(r -1 ,c , m, vis)){
            pathobs(m,vis,ans,p + 'U',r -1,c);
        }

        if(isSafe(r,c -1, m, vis)){
            pathobs(m,vis,ans,p + 'L',r,c - 1);
        }

        vis[r][c] = 0;
    }
}
