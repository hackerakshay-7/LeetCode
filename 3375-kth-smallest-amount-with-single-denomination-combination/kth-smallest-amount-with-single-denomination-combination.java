class Solution {
    long gcd(long a , long b){
        while(b!=0){
            long temp = a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    long lcm(long a , long b){
        return a/gcd(a,b) * b;
    }

    private long count(long x, int[] arr) {
        // check all possible subsets of arr[i]
        // bitmasking is the best way
        // num of elements will be represented by bits
        // if bit is set then that idx value is within the subset
        // 2^n - 1 num of bits i.e. subsets
        long ans = 0l;
        int n = arr.length;
        for (int mask = 1; mask < (1 << n); mask++) {
            long multiple = 1;
            boolean add = false;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) !=0) {
                    add = !add;
                    multiple = lcm(multiple, arr[i]);
                    if(multiple > x) break; // search area k bahar wale common numbers 
                }
            }
            if(multiple > x) continue;
            long value = x/multiple; // lcm is the first common num
            // we get multiples of lcm excluded 
            if(!add) ans -=value;
            if(add) ans+=value;
        }
        return ans;
    }

    public long findKthSmallest(int[] coins, int k) {
        // count fun counts the num of elements in the sequence
        long e = 26;
        for (int a : coins) {
            e = Math.min(a, e);
        }
        e = k * e;
        long s = 1;
        while (s < e) {
            long mid = s + (e - s) / 2;
            if (count(mid, coins) < k) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        return s;
    }
}

/**
  */