class Solution
{
public int minSteps(String s, String t) {
int ans =0;
int freq [] = new int[26];
for(char c : s.toCharArray()) freq[c-'a']++;
for(char c : t.toCharArray()) freq[c-'a']--;
for(int a : freq) ans+=Math.abs(a);
return ans;}}