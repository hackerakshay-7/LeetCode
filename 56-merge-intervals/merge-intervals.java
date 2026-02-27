class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==1) return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int []> list = new ArrayList<>();
        for(int [] interval : intervals){
            int n = list.size();
            if(n==0 || list.get(n-1)[1]<interval[0]) list.add(interval);
            else{
                list.get(n-1)[1]=Math.max(interval[1],list.get(n-1)[1]);
            }
        }
      return list.toArray(new int [list.size()][]); }
}