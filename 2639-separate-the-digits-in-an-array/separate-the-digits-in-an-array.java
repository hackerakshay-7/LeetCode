class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        for(int a : nums){
            sb.append(a);
        }
        for(int i =0;i<sb.length();i++){
            list.add(sb.charAt(i)-'0');
        }
   return list.stream().mapToInt(Integer::intValue).toArray(); }
}