class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> l = new ArrayList<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            map1.put(ch1, i);
        }
        int i = 0;
        int start = 0;
        while (i < s.length()) {
            int j = i + 1;
            int max = map1.get(s.charAt(i));
            while (j < max) {
                max = Math.max(map1.get(s.charAt(j)), max);
                j++;
            }
            if(max + 1 - start!=0){
                 l.add(max + 1 - start);
            }
           
            start = max+1;
            i = j ;

        }
        return l;
    }
}