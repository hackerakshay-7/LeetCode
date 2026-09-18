class Solution {
    public List<String> maxNumOfSubstrings(String s) {
         int n = s.length();

        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first, -1);

       
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';

            if (first[c] == -1) {
                first[c] = i;
            }

            last[c] = i;
        }

        List<int[]> intervals = new ArrayList<>();
        for (int c = 0; c < 26; c++) {
            if (first[c] == -1)
                continue;

            int start = first[c];
            int end = last[c];

            boolean valid = true;
            for (int j = start; j <= end; j++) {

                int x = s.charAt(j) - 'a';
                if (first[x] < start) {
                    valid = false;
                    break;
                }

                end = Math.max(end, last[x]);
            }

            if (valid) {
                intervals.add(new int[]{start, end});
            }
        }
        intervals.sort((a, b) -> Integer.compare(a[1], b[1]));

        List<String> ans = new ArrayList<>();

        int previousEnd = -1;
        for (int[] interval : intervals) {

            int start = interval[0];
            int end = interval[1];

            if (start > previousEnd) {
                ans.add(s.substring(start, end + 1));
                previousEnd = end;
            }
        }

        return ans;
    }
}

/**
class Solution {
    public List<String> maxNumOfSubstrings(String s) {
         int n = s.length();

        HashMap<Character, int[]> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (!map.containsKey(c)) {
                map.put(c, new int[]{i, i});
            } else {
                map.get(c)[1] = i;
            }
        }

        List<String> ans = null;
        for (int i = 0; i < n; i++) {

            List<String> temp = new ArrayList<>();

            int j = i;

            while (j < n) {

                char a = s.charAt(j);

                int st = map.get(a)[0];
                int e = map.get(a)[1];
                if (st < i) {
                    j++;
                    continue;
                }
                j = e + 1;

                temp.add(s.substring(st, e + 1));
            }
            if (ans == null ||
                temp.size() > ans.size() ||
                (temp.size() == ans.size() && check(ans, temp))) {

                ans = new ArrayList<>(temp);
            }
        }

        return ans;
    }

    boolean check(List<String> ans, List<String> temp) {

        int a = 0;
        int b = 0;

        for (String x : ans)
            a += x.length();

        for (String x : temp)
            b += x.length();

        return b < a;
    
    }
}


/**
// n^2 is pretty straight forward
   // how come n log n || n maybe ?? am i a dick
    public List<String> maxNumOfSubstrings(String s) {
        int n =s.length();
// let us see the very first and last occurence of any character within s
        HashMap<Character,int []> map = new HashMap<>();
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            if(!map.contains(ch)){
                map.put(ch,new int[]{i,i});
            }
            else{
                map.get(ch)[1]=i;
            }
        }
        // each character can only be present in a single subsequence
        // lets try to brute
        ArrayList<String> ans = new ArrayList<>();
        for(int i =0;i<n;i++){
            List<String> temp = new ArrayList<>();
           int j =i;
           while(j<n){
              char a = s.charAt(j);
              int st =map.get(a)[0];
              int e = map.get(a)[1];
            if(st<j){j++;continue;}
              j=e+1;
              temp.add(s.substring(st,e+1));
           }
           if(ans==null || (temp.size()==ans.size() && check(ans,temp)) ||
           temp.size()>ans.size()){
            ans = new ArrayList<>(temp);
           }
        }
   return ans;  */