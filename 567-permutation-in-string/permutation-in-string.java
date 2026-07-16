class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        int arr[] = new int[26];
        for (char c : s1.toCharArray()) {
            arr[c - 'a']++;
        }
        // a size ki har possible window check krta hu
        //sliding window
        int brr[] = new int[26];
        int size = s1.length();
        int j=0;
        while (j<size) {
            brr[s2.charAt(j++) - 'a']++;
        }
        for(int i =0;i<s2.length()-size;i++){
            if(Arrays.equals(arr,brr)) return true;
            brr[s2.charAt(i)-'a']--;
            brr[s2.charAt(j)-'a']++;
            j++;
        }

  return Arrays.equals(arr,brr);  }
}