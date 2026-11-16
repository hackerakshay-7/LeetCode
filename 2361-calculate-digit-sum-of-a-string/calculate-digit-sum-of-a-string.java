class Solution {
   private StringBuilder sf(StringBuilder sb, int k) {
    StringBuilder s = new StringBuilder();
    int count = 0;
    int sum = 0;
    for (int i = 0; i < sb.length(); i++) {
        count++;
        sum += (sb.charAt(i) - '0');
        if (count % k == 0 || i == sb.length() - 1) {
            s.append(sum);
            sum = 0;
            count = 0;
        }
    }
    return s;
}
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.length()>k){
            sb = sf(sb,k);
        }
   return sb.toString(); }
}