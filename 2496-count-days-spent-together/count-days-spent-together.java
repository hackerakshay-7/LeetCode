class Solution {
    // alice arrives before -> take bob n alice
    // bob arives before -> take alice intersection bob
    // both arrive @ same day 
    public int countDaysTogether(String aA, String lA, String aB, String lB) {
          int aAmonth = (aA.charAt(0) - '0') * 10 + (aA.charAt(1) - '0');
        int aAday = (aA.charAt(3) - '0') * 10 + (aA.charAt(4) - '0');
        int lAmonth = (lA.charAt(0) - '0') * 10 + (lA.charAt(1) - '0');
        int lAday = (lA.charAt(3) - '0') * 10 + (lA.charAt(4) - '0');

        int aBmonth = (aB.charAt(0) - '0') * 10 + (aB.charAt(1) - '0');
        int aBday = (aB.charAt(3) - '0') * 10 + (aB.charAt(4) - '0');
        int lBmonth = (lB.charAt(0) - '0') * 10 + (lB.charAt(1) - '0');
        int lBday = (lB.charAt(3) - '0') * 10 + (lB.charAt(4) - '0');

        int arr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int ans = 0;

        if ((aAmonth > lAmonth && aAmonth > lBmonth) || (aBmonth > aAmonth && aBmonth > lAmonth))
            return ans; // no intersection
             int startMonth, startDay;
        if (aAmonth > aBmonth || (aAmonth == aBmonth && aAday > aBday)) {
            startMonth = aAmonth;
            startDay = aAday;
        } else {
            startMonth = aBmonth;
            startDay = aBday;
        }

        int endMonth, endDay;
        if (lAmonth < lBmonth || (lAmonth == lBmonth && lAday < lBday)) {
            endMonth = lAmonth;
            endDay = lAday;
        } else {
            endMonth = lBmonth;
            endDay = lBday;
        }

        if (startMonth > endMonth ||
            (startMonth == endMonth && startDay > endDay)) {
            return 0;
        }

         ans = arr[startMonth - 1] - startDay + 1;

        for (int i = startMonth; i < endMonth; i++) {
            ans += arr[i];
        }

        ans -= arr[endMonth - 1] - endDay;

        return ans;
    }
}
/**
if (aAmonth > aBmonth) {
            if (lAday < lBday) {
                // days = alice leaving - bob arrival 
                ans += (arr[aBmonth - 1] - aBday); // idx not form zero
                for (int i = aBmonth; i < lAmonth; i++) {
                    ans += arr[i];
                }
                ans += lAday;
            }
            // else if(lBday<lAday){
            //     // days = bob leaving - bob arrival
            // }
            else {
                // days = bob/alice leaving - bob arrival ## skip the else if
                ans += arr[aBmonth - 1] - aBday;
                for (int i = aBmonth; i < lBmonth; i++) {
                    ans += arr[i];
                }
                ans += lBday;
            }
        }
        // else if(aBmonth>aAmonth){
        //     if(lAday<lBday){
        //         // days = alice leaving - alice arrival 
        //     }
        //     else if(lBday<lAday){
        //         // days = bob leaving - alice arrival
        //     }
        //     else{
        //         // days = bob/alice leaving - bob arrival ## skip the else if
        //     }
        // }
        else {
            // both arrive on same month
            if (lAday < lBday) {
                // days = alice leaving - alice arrival 
                ans +=(arr[aAmonth-1]-aAday);
                for(int i = aAmonth;i<lAmonth;i++){
                    ans+=(arr[i]);
                }
                ans+=(lAday);
            }
            // else if(lBday<lAday){
            //     // days = bob leaving - alice arrival
            // }
            else {
                // days = bob/alice leaving - bob arrival ## skip the else if
                ans+=(arr[aBmonth-1]-aBday);
                for(int i = aBmonth;i<lBmonth;i++){
                    ans+=arr[i];
                }
                ans+=(lBday);
            }

        } */