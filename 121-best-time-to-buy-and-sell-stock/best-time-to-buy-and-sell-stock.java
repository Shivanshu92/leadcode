class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int minPrice = arr[0];
        int maxProfit = 0;
        for(int i=0;i<n;i++){
            minPrice = Math.min(minPrice,arr[i]);
            int profit = arr[i] - minPrice;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}