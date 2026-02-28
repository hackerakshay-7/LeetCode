class Solution {
    public int minimumSwap(String s1, String s2) {
        // key yeh hai ke pair dono ke same index wale letter ka karo
        int xy = 0, yx = 0;
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            if (a != b) {
                if (a == 'x')
                    xy++;
                else {
                    yx++;
                }
            }
        }
        if ((xy + yx) % 2 != 0)
            return -1;

        // ek swap se two pairs theek hote hai; aur single swap chaiye 
        // pairs like xx aur yy ko avoid krna hai coz they are already fine 
        int ans = xy / 2 + yx / 2;
        // last ke bache 2 swap wala pair 
        // agar odd hai xy  toh coz xy+yx%2=0 (dono odd honge phir)
        // last wale swap ka additional 2;
        return xy % 2 != 0 ? ans + 2 : ans;
    }
}

/*
 int swaps = 0;
        int xcount = 0, ycount = 0;
        int x2count =0, y2count =0;
        for (char a : s1.toCharArray()) {
            if (a == 'x')
                xcount++;
            else {
                ycount++;
            }
        }
        for (char a : s2.toCharArray()) {
            if (a == 'x')
                x2count++;
            else {
                y2count++;
            }
        }
        if (xcount+x2count != ycount+y2count)
            return -1;
        if((xcount+x2count)%2!=0)
            return -1;
        if(xcount != x2count) return Math.max(xcount,x2count); */