class Solution {
    public double averageWaitingTime(int[][] customers) {
        double n = customers.length;
        long sum =customers[0][1];
        long thres = customers[0][0]+customers[0][1];
        for(int i =1;i<customers.length;i++){
            if(customers[i][0]>thres){ sum+=customers[i][1];thres=customers[i][0]+customers[i][1];}
            else{sum+=(thres+customers[i][1]-customers[i][0]); thres+=customers[i][1];}
        }
   return (double)sum/n; }
}