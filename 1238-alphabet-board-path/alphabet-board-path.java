class Solution {
    // the z bastard is an  edge case
    class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public String alphabetBoardPath(String target) {
        Map<Character, Pair> map = new HashMap<>();
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                map.put((char) (k + 97), new Pair(i, j));
                k++;
            }
        }
        map.put('z', new Pair(5, 0));
        StringBuilder sb = new StringBuilder();
        Pair init = new Pair(0, 0);
        for (char c : target.toCharArray()) {
            int a = map.get(c).x - init.x;
            int b = map.get(c).y - init.y;

            if (c == 'z') {
                if (b < 0) {
                    for (int i = 0; i < -b; i++) {
                        sb.append('L');
                    }
                }

                if (a > 0) {
                    for (int i = 0; i < a; i++) {
                        sb.append('D');
                    }
                }
            }

            else {
                if (a > 0) {
                    for (int i = 0; i < a; i++) {
                        sb.append('D');
                    }
                } else if (a < 0) {
                    for (int i = 0; i < (-a); i++) {
                        sb.append('U');
                    }
                }
                if (b > 0) {
                    for (int i = 0; i < b; i++) {
                        sb.append('R');
                    }
                } else if (b < 0) {
                    for (int i = 0; i < (-b); i++) {
                        sb.append('L');
                    }
                }
            }
            sb.append('!');
            init = map.get(c);
        }

        return sb.toString();
    }
}