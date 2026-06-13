class Solution {
    public int magicalString(int n) {
        if(n<=3) return 1;
        StringBuilder sb = new StringBuilder();
        sb.append("12211");
        int i =3;
        boolean one = false;
        while(sb.length()<n){
            if(one &&sb.charAt(i)=='1'){sb.append('1'); }
            else if(one && sb.charAt(i)=='2') sb.append("11");
            else if(!one && sb.charAt(i)=='1') sb.append('2');
            else if(!one && sb.charAt(i)=='2') sb.append("22");
            one=!one;
            i++;
        }
        int onecount=0;
        for(int j=0;j<n;j++){
            if(sb.charAt(j)=='1') onecount++;
        }
   return onecount; }
}