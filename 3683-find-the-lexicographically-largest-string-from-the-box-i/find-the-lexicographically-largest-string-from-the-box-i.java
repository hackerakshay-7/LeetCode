class Solution {
    public String answerString(String word, int n) {
        if(n==1) return word;
        int len = word.length();
        StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        int need = len-n+1;
        int j =0;
        for(int i =0;i<len;i++){
            char c = word.charAt(i);
            temp.append(c);
            while(i-j+1>need){
                temp.deleteCharAt(0);
                j++;
            }
            
                if(temp.compareTo(ans)>0){
                    ans = new StringBuilder(temp);
            }
        }
        temp.setLength(0);
        // len - subseqlen +1
        for(int i =len-need+1;i<len;i++){
             temp = new StringBuilder(word.substring(i));
            if(temp.compareTo(ans)>0) ans=new StringBuilder(temp);
        }
    return ans.toString();}
}