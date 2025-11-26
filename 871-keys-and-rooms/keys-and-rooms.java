class Solution {
    private void dfs(List<List<Integer>> list , int k,boolean[] arr){
        arr[k]=true;
        for(int a : list.get(k)){
            if(!arr[a]){
                dfs(list,a,arr);
            }
        }
     }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean arr[] = new boolean[rooms.size()];
        arr[0]=true;
        dfs(rooms,0,arr);
        for(boolean a : arr){ if(a==false) return false;}
        return true;
    }
}