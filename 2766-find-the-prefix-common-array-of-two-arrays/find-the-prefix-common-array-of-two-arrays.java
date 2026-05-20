class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int [] c = new int[A.length];
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int count =0;
        for(int i =0;i<A.length;i++){
            set.add(A[i]);
            set2.add(B[i]);
            if(set2.contains(A[i])){
                count++;}
                if(A[i]!=B[i] && set.contains(B[i])) count++;
             c[i]=count;
        }

  return c;  }
}