class Solution {
    // mkbsda set lagana padega 
    private void back(List<String> ans, String num, String temp,boolean[]isv) {
        if (temp.length() == num.length()) {
            if ((temp.charAt(0) - '0' < 3) && temp.charAt(2) - '0' < 6){
                if(temp.charAt(0)=='2' && temp.charAt(1)>='4') return;
                ans.add(new String(temp));}
            return;
        }
        for (int i = 0; i < num.length(); i++) {
            if(isv[i]) continue;
            isv[i]=true;
            back(ans, num, temp + num.charAt(i),isv);
            isv[i]=false;
        }

    }

    public String largestTimeFromDigits(int[] arr) {
        String s = "";
        for (int a : arr)
            s += a;
        ArrayList<String> temp = new ArrayList<>();
        back(temp, s, "",new boolean[4]);
        if (temp.size() == 0)
            return "";
        int index = -1;
        int k = 0;
        for (int i = 0; i < temp.size(); i++) {
            if (Integer.parseInt(temp.get(i)) >= k)
               { index = i;k=Integer.parseInt(temp.get(i));}
        }
        StringBuilder ans = new StringBuilder(5);
        for (int i = 0; i < temp.get(index).length(); i++) {
            if (ans.length() == 2)
                ans.append(':');
            ans.append(temp.get(index).charAt(i));
        }

        return ans.toString();
    }
}