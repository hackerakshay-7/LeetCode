class Solution {
    class Node {
        Node[] children;
        boolean isend;

        Node() {
            children = new Node[26];
        }
    }

    Node root = new Node();

    void insert(String s) {
        Node temp = root;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (temp.children[idx] == null) {
                temp.children[idx] = new Node();
            }
            temp = temp.children[idx];
        } temp.isend = true;

    }

    public List<String> findWords(char[][] board, String[] words) {
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        boolean isv[][] = new boolean[board.length][board[0].length];
        ArrayList<String> list = new ArrayList<>();
          Node temp = root;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int idx = board[i][j] - 'a';
                if (temp.children[idx] != null)
                    back(list, board, isv, "", i, j, temp);
            }
           
        }
    return list; }

    private void back(List<String> list, char[][] board, boolean[][] isv, String s, int i, int j, Node temp) {
        if (i >= board.length || j >= board[0].length || i < 0 || j < 0 || temp.children[board[i][j] - 'a'] == null
                || isv[i][j])
            return;
        Node curr = temp.children[board[i][j] - 'a'];
        if (curr.isend == true) {
            list.add(s+board[i][j]);
            curr.isend = false;
        }
        isv[i][j] = true;
        back(list, board, isv, s + board[i][j], i + 1, j, curr);
        back(list, board, isv, s + board[i][j], i, j + 1, curr);
        back(list, board, isv, s + board[i][j], i - 1, j, curr);
        back(list, board, isv, s + board[i][j], i, j - 1, curr);
        isv[i][j] = false;
    }
}