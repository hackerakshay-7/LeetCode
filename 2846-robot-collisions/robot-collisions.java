class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        Integer indices[] = new Integer[positions.length];
        for (int i = 0; i < positions.length; i++) {
            indices[i] = i; //[0,1,2,3...]
        }
        Arrays.sort(indices, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return positions[a] - positions[b];
                //if a-b = -ve or zero then no swap
                //if a-b = +ve then swap
            }
        });
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (Integer index : indices) {
            if (directions.charAt(index) == 'R') {
                //blind insertion
                st.push(index);
            }
              else {
                //---L to be inserted
                boolean surviving = true;
                while (!st.isEmpty()) {
                    Integer topindex = st.peek();
                    if (directions.charAt(topindex) == 'L') {
                        // case 1 as top is also L blind insertion 
                        surviving = true;
                        break;
                    }
                    //case 2 collision hoga aur right ki health zyada hai left se 
                    else if(healths[topindex]>healths[index]){
                        surviving = false;
                        healths[topindex]-=1;
                        healths[index]=0;
                        break;
                    }
                    // case 3 collision with bada left wala will not insert but destroy top R wala
                    else if ( healths[topindex]<healths[index]){
                        surviving = true;
                        healths[index]-=1;
                        healths[topindex]=0;
                        st.pop();
                    }
                    else if(healths[index]==healths[topindex]){
                        st.pop();
                        surviving = false;
                        healths[index]=0;
                        healths[topindex]=0;
                        break;
                    }

                }
                if(surviving) st.push(index); // left direction robot ko push
            }
        }
        for(int a : healths){
            if(a>0){
                ans.add(a);
            }
        }

   return ans; }
}