class Solution {
     void kill(List<Integer> list ,int  k,int i){
            if(list.size()==1) return;
            int index = (k+i-1)%list.size();
            list.remove(index);
            kill(list,k,index);
        }
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =1;i<=n;i++){
            list.add(i);}
        kill(list,k,0);
        return list.get(0);
    }
}