class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if(n==0){if(m%2!=0){return nums2[m/2];}
         else{return (((double)nums2[m/2]+(double)nums2[(m/2)-1]))/2;}}
        else if(m==0){if(n%2!=0){return nums1[n/2];}
         else{return (((double)nums1[n/2]+(double)nums1[(n/2)-1]))/2;}}



        int arr[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
                if(nums1[i]>nums2[j]){ arr[k++]=nums2[j++];}
                else{ arr[k++]=nums1[i++];}
            } while(k<arr.length){ 
                if(i>=n){ arr[k++]=nums2[j++];}
                else{arr[k++]=nums1[i++];}}
                double p = ((double)(arr[(arr.length/2)-1]) + (double)(arr[(arr.length/2)]))/2;
        
   return arr.length%2==0?p:arr[(arr.length/2)]; }
}