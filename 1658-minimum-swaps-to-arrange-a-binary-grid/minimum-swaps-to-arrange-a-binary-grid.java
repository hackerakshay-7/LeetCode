class Solution {
    int maxposition(int[] arr) {
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                pos = i;
        }
        return pos;
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[j] = temp;
    }

    public int minSwaps(int[][] grid) {
        int step = 0;
        int arr[] = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            int temp = maxposition(grid[i]);
            arr[i] = temp;
        }
        // bubble sort!!!!!!!
        for (int i = 0; i < grid.length; i++) {
            if (arr[i] > i) {
                int j = i + 1;
                while (j < arr.length && arr[j]>i) j++;
                if(j==arr.length) return -1;
                int temp = arr[j];
                while(j>i){
                    arr[j]=arr[j-1];
                    j--;
                    step++;
                }
                arr[i]=temp;
            }
        }
        // for (int i = 0; i < grid.length; i++) {
        //     if (arr[i] > i)
        //         return -1;
        // }

        return step;
    }
}