class Solution {
    public int numberOfSpecialChars(String word) {
    HashMap<Character,Integer> caps = new HashMap<>(); 
    HashMap<Character,Integer> low = new HashMap<>();
    int count=0;
    for(int i =0;i<word.length();i++){
        char c = word.charAt(i);
        if(c>=97 && c<=123){
           low.put(c,i);
        }
        else{
            if(caps.containsKey(c)) continue;
            caps.put(c,i);
        }
    }  
    for(int i=0;i<26;i++){
        char capc = (char)(i+65);
        char lowc = (char)(i+97);
    if(low.containsKey(lowc)
     && caps.containsKey(capc) && (low.get(lowc) < caps.get(capc))){count++;}
    } 
    return count;}
}