class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        // beholding that size is same
        // right nahi dekhna agar bada mil gya toh nahi mila toh bhi nahi dekhna 
        int ans = 0;
        int i =0,j=0;
        while(j<nums2.length && i<nums1.length){
            if(nums2[j]>=nums1[i]){ans = Math.max(ans,j-i); j++;}
            else{i++;}
           
        }
        
    return ans;}
}