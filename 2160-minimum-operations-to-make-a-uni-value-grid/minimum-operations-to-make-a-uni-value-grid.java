class Solution {
    public int minOperations(int[][] grid, int x) {
       ArrayList<Integer> list = new ArrayList<>();
        int mod =grid[0][0]%x;
        for(int a []: grid){
            for(int b : a){
                if(b%x!=mod)return -1;
                list.add(b);
            }
        }
        Collections.sort(list);
        int find = list.get(list.size()/2);
        int steps=0;
        for(int a : list){
            steps+=Math.abs(a-find)/x;
        }


   return steps; }
}