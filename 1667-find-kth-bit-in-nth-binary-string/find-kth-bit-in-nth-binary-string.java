class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder [] arr = new StringBuilder[n];
        arr[0]=new StringBuilder("0");
        for(int i =1;i<arr.length;i++){
            StringBuilder s = arr[i-1];
           StringBuilder sb = new StringBuilder();
           for(int j=0;j<arr[i-1].length();j++){
           if (s.charAt(j)=='0') sb.append("1");
           else{ sb.append("0");}
           }
           sb.reverse();
           arr[i]= new StringBuilder(arr[i-1] +"1" +sb);


        }
    return arr[n-1].charAt(k-1);}
}

/*
 int a = (Integer.valueOf(arr[i-1]));
            int b = ~a;
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.reverse();
            arr[i]=s+sb;*/