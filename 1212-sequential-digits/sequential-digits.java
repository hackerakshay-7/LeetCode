class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        // n^2 nahi hai bhidu high.len ^2 hoga atmost (0)
        for(int i=1;i<=9;i++){
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            for(int j = i+1;j<=9;j++){
                sb.append(j);
                int a = Integer.parseInt(sb.toString());
                if(a>=low && a<=high) list.add(a);
            }
        }
        Collections.sort(list);
   return list; }
}