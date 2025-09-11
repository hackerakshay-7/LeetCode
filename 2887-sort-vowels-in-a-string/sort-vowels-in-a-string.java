class Solution {
    public String sortVowels(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        String t="";
        int arr[]=new int[s.length()];
     for(int i=0;i<s.length();i++){
        int x = s.charAt(i);
        arr[i]=x;
        if(x==97 || x==101 || x== 105 || x==111 ||x== 117){list.add(x);}
        else if( x==65 || x== 69|| x== 73 || x== 79|| x== 85 ) {list.add(x);}}
        Collections.sort(list);
        int j=0;
    for(int i=0;i<s.length();i++){
        int x = s.charAt(i);
        if(x==97 || x==101 || x== 105 || x==111 ||x== 117){ t=t+( (char)(int)list.get(j)); j++; }
         else if( x==65 || x== 69|| x== 73 || x== 79|| x== 85 ) { t=t+( (char)(int)list.get(j)); j++;}
        else{t=t+s.charAt(i);}
    }
  return t;  }
}