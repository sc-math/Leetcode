import java.util.Arrays;

public class Valid_Sudoku_36 {
    public boolean isValidSudoku(char[][] board) {
        int [] nums = new int [9];

        // Linhas
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] != '.'){
                    int num = board[i][j] - '0';
                    if(nums[num-1] != 0){
                        return false;
                    }
                    nums[num-1]++;
                }
            }

            Arrays.fill(nums, 0);
        }

        // Colunas
        for(int j = 0; j < board.length; j++){
            for(int i = 0; i < board.length; i++){
                if(board[i][j] != '.'){
                    int num = board[i][j] - '0';
                    if(nums[num-1] != 0){
                        return false;
                    }
                    nums[num-1]++;
                }
            }

            Arrays.fill(nums, 0);
        }

        // Boxes
        for(int boxes = 0; boxes < 9; boxes++){

            int [] rc_init = new int[]{0, 3, 6};

            for(int i = rc_init[boxes%3]; i < rc_init[boxes%3]+3; i++){
                for(int j = rc_init[boxes/3]; j < rc_init[boxes/3]+3; j++){
                    if(board[i][j] != '.'){
                        int num = board[i][j] - '0';
                        if(nums[num-1] != 0){
                            return false;
                        }
                        nums[num-1]++;
                    }
                }
            }

            Arrays.fill(nums, 0);
        }

        return true;
    }
}
