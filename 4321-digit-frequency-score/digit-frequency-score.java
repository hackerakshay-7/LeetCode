class Solution {
    public int digitFrequencyScore(int n) {
        int digisum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (n > 0) {
            int temp = n % 10;
            map.put(temp, map.getOrDefault(temp, 0) + 1);
            n /= 10;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            digisum += (entry.getKey() * entry.getValue());
        }
        return digisum;
    }
}