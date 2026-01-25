class Solution {
    // void swap(ArrayList<Integer> list,int s,int e){
    //     while(s<e){
    //         Integer temp = list.get(s);
    //         list.set(s,list.get(e));
    //         list.set(e,temp);
    //         s++;e--;
    //     }
    // }
    void trash(ArrayList<Integer> list,int k){
        Integer arr[]=new Integer[list.size()];
        for(int i=0;i<list.size();i++){ arr[i]=list.get(i);}
      int i=0,j=k;
      while(j<arr.length){
        list.set(i,arr[j]); i++;j++;
      } j=0;
      while(j<k){ list.set(i,arr[j]);i++;j++;}
    }
   
    public int[] rotateElements(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : nums) if(a>=0) list.add(a);
        if(list.size()==0) return nums;
        k%=list.size();
        if(k==0) return nums;
        trash(list,k);
      //  swap(list,0,list.size()-k-1);
        //swap(list,list.size()-k,list.size()-1);
        //swap(list,0,list.size()-1);
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i]>=0){ nums[i]=list.get(j);j++;} i++;
        }
   return nums; }
}