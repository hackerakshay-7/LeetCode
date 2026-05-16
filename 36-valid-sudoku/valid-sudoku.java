class Solution {
    boolean ans(char[][] board, int row, int column) {
        HashSet<Character> set = new HashSet<>();
        for (int i = row; i < row + 3; i++) {
            for (int j = column; j < column + 3; j++) {
                if (board[i][j] == '.')
                    continue;
                else if (set.contains(board[i][j]))
                    return false;
                
                    set.add(board[i][j]);
                
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        // row check + column check
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            HashSet<Character> set2 = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (set.contains(board[i][j]))
                    return false;
                if (set2.contains(board[j][i]))
                    return false;
                if (board[i][j] != '.')
                    set.add(board[i][j]);
                if (board[j][i] != '.')
                    set2.add(board[j][i]);
            }
        }
        // now for 3X3 grid 
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!ans(board, i, j))
                    return false;
            }
        }

        return true;
    }
}