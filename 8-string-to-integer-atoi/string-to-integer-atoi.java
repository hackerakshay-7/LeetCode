class Solution {
    public int myAtoi(String s) {
        long sum=0; boolean is = false,fs=true;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
    if(ch==' ' && fs) continue;
else if( ch=='0'||ch =='1' || ch=='2'|| ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'|| ch=='9')
{sum = sum*10+(ch-'0'); fs=false;}
    else if(fs && ch=='-'){is=true; fs=false;}
    else if(fs && ch=='+'){ is = false; fs = false;}
    else{return is?(int)sum*-1:(int)sum;}
    if(sum>Integer.MAX_VALUE) return is?Integer.MIN_VALUE:Integer.MAX_VALUE;}
   return is ?(int)sum*-1:(int)sum; }
}