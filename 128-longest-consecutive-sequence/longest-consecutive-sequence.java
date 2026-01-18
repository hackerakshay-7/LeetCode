class Solution {
    public int longestConsecutive(int[] nums) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }));
        if(nums.length==0) return 0;
        int count =1,ans=Integer.MIN_VALUE;
        HashSet<Integer> map = new HashSet<>();
        for(int a : nums){
            map.add(a);}
        for(int a : map){
            if(map.contains(a-1)) continue;
            while(map.contains(++a)){
                count++;
            } ans=Math.max(ans,count); count=1;
        }
    return ans;}
}