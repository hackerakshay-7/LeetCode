class Solution {
    boolean issorted(char [] arr){
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;}
    public int minOperations(String s) {
        int n = s.length();
        char arr []= s.toCharArray();
        char brr [] = s.toCharArray();
        if(issorted(arr)) return 0;
        if(n==2) return -1;
        // 3 sorts  0 to last-1 then 1 to last then 1 to last-1;
        Arrays.sort(arr,1,n);
        Arrays.sort(brr,0,n-1);
        if(issorted(arr) || issorted(brr)) return 1;
        Arrays.sort(arr,0,n-1);
        Arrays.sort(brr,1,n);
        if(issorted(arr) || issorted(brr)) return 2;
        else{ return 3;}

        
    }
}