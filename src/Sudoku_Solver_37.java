import java.util.Arrays;

public class Sudoku_Solver_37 {
    public void solveSudoku(char[][] board) {
        completeSudoku(board, 0);

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    boolean completeSudoku(char[][] board, int step){
        if(step == 81) return true;

        int row = step / 9;
        int col = step % 9;

        if(board[row][col] != '.'){
            return completeSudoku(board, step + 1);
        }

        for(char num = '1'; num <= '9'; num++){
            if(isValid(board, row, col, num)){
                board[row][col] = num;
                if(completeSudoku(board, step + 1)){
                    return true;
                }
                board[row][col] = '.';
            }
        }

        return false;
    }

    boolean isValid(char[][] board, int row, int col, char num){

        // Verifica Coluna
        for(int i = 0; i < 9; i++){
            if(board[i][col] == num && i != row) return false;
        }

        // Verifica Linha
        for(int j = 0; j < 9; j++){
            if(board[row][j] == num && j !=col) return false;
        }

        // Verifica box
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num && !(i == row && j == col)) {
                    return false;
                }
            }
        }

        return true;
    }
}
