class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = 0;
        int min =Integer.MAX_VALUE;
        // even-even= even
        // odd-odd = even
        // even-odd = odd
        // insight -> if smallest number is odd we can convert every even num. into odd and the array will be odd array;
        for(int a : nums1){ 
            if(a%2!=0) odd++;
            min = Math.min(min,a);}
        if(odd==0 || odd == nums1.length) return true;
        if(min%2!=0) return true;
        return false;
    }
}