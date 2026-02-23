class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> st=new HashSet<>();
        for(int a : nums){
            st.add(a);
        }
        for(int i=1;i<=nums.length;i++){
            if(!st.contains(i)) list.add(i);
        }
  return list; }
}