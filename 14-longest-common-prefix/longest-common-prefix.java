class Solution {
    class Node {
        Node[] children;
        boolean isend;
        int childcount;

        Node() {
            children = new Node[26];
            isend = false;
        }
    }

    Node root = new Node();

    void insert(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (temp.children[idx] == null) {
                temp.children[idx] = new Node();
                temp.childcount++;
            }
            if (i == word.length() - 1)
                temp.children[idx].isend = true; // last word inserted
            temp = temp.children[idx];

        }

    }
    String sol(String strs){
        String ans ="";
        Node t = root;
        for(int i =0;i<strs.length();i++){
            if(t.childcount==1) {ans+=strs.charAt(i);
            int idx = strs.charAt(i)-'a';
            t=t.children[idx];}
            else break;
            if(t.isend==true) break;
        }
        return ans;
    }

    public String longestCommonPrefix(String[] strs) {
        for(int i =0;i<strs.length;i++){
            if(strs[i].length()==0) return "";
            insert(strs[i]);
        }
    return sol(strs[0]);}
}