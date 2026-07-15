class Solution {
    private void jerk(ArrayList<String> list , int n , StringBuilder sb){
        if(sb.length()==n){
            list.add(new StringBuilder(sb).toString());
            return;
        }
        if( sb.length()==0 || sb.charAt(sb.length()-1)=='1'){
            // no two adjacent zeroes
            sb.append('0');
            jerk(list,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
            sb.append('1');
            jerk(list,n,sb);
            sb.deleteCharAt(sb.length()-1);
    }
    public List<String> validStrings(int n) {
        // we can always brute force -> generate all and add valid ones;
        if(n ==1) return new ArrayList<>(Arrays.asList("0","1"));
        ArrayList<String> list = new ArrayList<>();
        jerk(list,n,new StringBuilder());
        return list;
    }
}