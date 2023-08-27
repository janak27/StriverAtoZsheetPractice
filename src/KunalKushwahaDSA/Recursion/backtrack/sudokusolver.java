package KunalKushwahaDSA.Recursion.backtrack;

public class sudokusolver {
    public static void main(String[] args) {

    }
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }

    boolean solve(char[][] board, int row, int col){
        if(row == board.length){
            return true;
        }
        if(col == board.length){
            return solve(board,row + 1, 0);
        }
        if(board[row][col] != '.'){
            return solve(board,row, col + 1);
        }
        for(char num = '1' ; num <= '9'; num++){
            if(isSafe(board, row, col, num)){
                board[row][col] = num;

                if(solve(board,row,col + 1)){
                    return true;
                }

                board[row][col] = '.';
            }
        }
        return false;
    }

    boolean isSafe(char[][] board,int row, int col, char num){
        for (int i = 0; i < board.length; i++) {
            // Check row
            if (board[i][col] == num) {
                return false;
            }

            // Check column
            if (board[row][i] == num) {
                return false;
            }

            // Check 3x3 subgrid
            int subgridRow = 3 * (row / 3) + i / 3; // Calculate row index of subgrid
            int subgridCol = 3 * (col / 3) + i % 3; // Calculate column index of subgrid

            if (board[subgridRow][subgridCol] == num) {
                return false;
            }
        }

        // Placement is valid
        return true;
    }
}
