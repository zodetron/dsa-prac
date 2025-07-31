package day10;
import java.util.*;

public class day10b {
        public boolean isValidSudoku(char[][] board) {
            Map<Integer, Set<Character>> cols = new HashMap<>();
            Map<Integer, Set<Character>> rows = new HashMap<>();
            Map<String, Set<Character>> squares = new HashMap<>();

            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    if (board[r][c] == '.') continue;

                    String squareKey = (r / 3) + "," + (c / 3);

                    if (rows.computeIfAbsent(r, k -> new HashSet<>()).contains(board[r][c]) ||
                            cols.computeIfAbsent(c, k -> new HashSet<>()).contains(board[r][c]) ||
                            squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(board[r][c])) {
                        return false;
                    }

                    rows.get(r).add(board[r][c]);
                    cols.get(c).add(board[r][c]);
                    squares.get(squareKey).add(board[r][c]);
                }
            }
            return true;
        }

    public static void main(String[] args) {
        day10b sol = new day10b();

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        boolean result = sol.isValidSudoku(board);
        System.out.println("Is the Sudoku board valid? " + result);
    }

}
