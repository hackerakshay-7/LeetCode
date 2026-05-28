class Trie {
     class Node{
        Node [] children;
        boolean isend;
        Node(){
            children = new Node[26]; // only small letters
            isend=false;
          //  for(int i =0;i<children.length;i++){ children[i]=null; }
        }}
        Node root = new Node();

    public Trie() {
        
    }
    
    public void insert(String word) {
         Node temp = root;
            for (int i = 0; i < word.length(); i++) {
                int idx = word.charAt(i) - 'a';
                if (temp.children[idx] == null) {
                    temp.children[idx] = new Node();
                }
                if (i == word.length() - 1) temp.children[idx].isend = true; // last word inserted
                temp = temp.children[idx];

            }
    }
    
    public boolean search(String word) {
         Node temp = root;
            for(int i =0;i<word.length();i++){
                int idx = word.charAt(i)-'a';
                if(temp.children[idx]==null) return false;
                if(i==word.length()-1 && temp.children[idx].isend==false) return false;
                temp=temp.children[idx];

            } return true;
    }
    
    public boolean startsWith(String prefix) {
         Node temp = root;
            for(int i =0;i<prefix.length();i++){
                int idx = prefix.charAt(i)-'a';
                if(temp.children[idx]==null) return false;
                temp=temp.children[idx];

            } return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */