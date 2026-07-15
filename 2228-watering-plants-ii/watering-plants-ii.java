class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        // if both on same place then one wid more water if equal water then alice
        int refill = 0;
        int alice = capacityA, bob = capacityB;
        int i = 0, j = plants.length - 1;
        while (i <= j) {
            if (i == j) {
                if (Math.max(alice, bob) <plants[i]) {
                    refill++;
                }
                 break;
            }
            if (alice < plants[i]) {
                refill++;
                alice = capacityA - plants[i];
                i++;
            } else if (alice >= plants[i]) {
                alice -= plants[i];
                i++;
            }
            if (bob < plants[j]) {
                refill++;
                bob = capacityB - plants[j];
                j--;
            } else if (bob >= plants[j]) {
                bob -= plants[j];
                j--;
            }
        }
        return refill;
    }
}