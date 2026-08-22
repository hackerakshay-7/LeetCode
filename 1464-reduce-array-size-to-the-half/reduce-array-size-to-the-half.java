class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
       int aks [] = new int[map.size()];
       int i=0;
       for(Map.Entry<Integer,Integer> a : map.entrySet()){
         aks[i++] = a.getValue();
       }
       Arrays.sort(aks);
       int sum =0,count=0;
       for(int j = aks.length-1;j>=0;j--){
            sum+=aks[j];
            count++;
            if(sum>=arr.length/2) return count;
       }
    return count;}
}
/**
 Map<Integer, Integer> map2 = new TreeMap<>();
        for (Map.Entry<Integer, Integer> a : map.entrySet()) {
            map2.put(a.getValue(), a.getKey());
        } */