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
    boolean isv(char board[][], int row, int col, char k) {
    for (int j = 0; j < 9; j++) {
        if (board[row][j] == k) return false;
    }

    for (int i = 0; i < 9; i++) {
        if (board[i][col] == k) return false;
    }

    // check 3x3 grid
    int sr = (row / 3) * 3;
    int sc = (col / 3) * 3;

    for (int i = sr; i < sr + 3; i++) {
        for (int j = sc; j < sc + 3; j++) {
            if (board[i][j] == k) return false;
        }
    }

    return true;
}
    
    public boolean solveSudoku(char[][] board) {
        for(int i =0;i<9;i++){
            for(int j =0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char k ='1';k<='9';k++){
                            if(isv(board,i,j,k)){
                                board[i][j]=k;
                                if(solveSudoku(board)) return true;
                                board[i][j]='.';
                            }
                    }
                    return false;
                }
            }
        }
  return true;  }
}

/**
boolean isv(char board[][],int row,int col,char k){
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

    } */