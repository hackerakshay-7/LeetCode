class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        int maxscore = 0;
        Arrays.sort(tokens);
        int i = 0, last = tokens.length - 1;
        while (i <= last) {
            if (power >= tokens[i]) {
                score++;
                power -= tokens[i];
                i++;
                maxscore = Math.max(maxscore, score);
            } else if (power < tokens[i] && score > 0 && last > i) {
                power += tokens[last];
                last--;
                score--;
            }

            else {
                return maxscore;
            }
        }

        return maxscore;
    }
}