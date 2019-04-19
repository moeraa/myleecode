package primary_algorithm;

import java.util.Arrays;

/**
 * @Auther: moer
 * @Date: 2019/4/17 09:24
 * @Description:
 *  有效的数独
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 *
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 */
public class Sudoku {
    public static boolean isValidSudoku1(char [][] board){
        boolean result = false;
        for (int i = 0; i<9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                int flag = board[i][j];
                if (flag != '.') {
                    for (int k = 8; k > j; k--) {
                        if (board[i][j] == board[i][k]) {
                            return false;
                        }
                    }
                    for (int k = 8; k > i; k--) {
                        if (board[i][j] == board[k][j])
                        {
                            return false;
                        }
                    }
                    for(int k = i + 1; k % 3 != 0; k ++){
                        for(int h = j ;h < j + 3; h ++ ) {
                            if (board[i][j] == board[k][h]) {
                                return false;
                            }
                        }
                    }
                }
            }

        }

        result = true;
        return result;
    }
    public static boolean isValidSudoku3(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] blks = new int[9];
        for (int ri = 0; ri < 9; ++ri) {
            for (int ci = 0; ci < 9; ++ci) {
                if (board[ri][ci] != '.') {
                    int bi = ri / 3 * 3 + ci / 3;
                    int uvb = 1 << (board[ri][ci] - '0');
                    if ((uvb & (rows[ri] | cols[ci] | blks[bi])) != 0) {
                        return false;
                    }
                    rows[ri] |= uvb;
                    cols[ci] |= uvb;
                    blks[bi] |= uvb;
                }
            }
        }
        return true;
    }
    public static boolean isValidSudoku(char [][] board){
        // 记录某行，某位数字是否已经被摆放
        boolean[][] row = new boolean[9][10];
        // 记录某列，某位数字是否已经被摆放
        boolean[][] col = new boolean[9][10];
        // 记录某 3x3 宫格内，某位数字是否已经被摆放
        boolean[][] block = new boolean[9][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    if (row[i][num] || col[j][num] || block[i / 3 * 3 + j / 3][num]) {
                        return false;
                    } else {
                        row[i][num] = true;
                        col[j][num] = true;
                        block[i / 3 * 3 + j / 3][num] = true;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board ={
                        {'8','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'}, 
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku3(board));
    }
}
