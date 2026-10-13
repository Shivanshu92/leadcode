class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int currMax = arr[0];
        int currMin = arr[0];
        int maxPro = arr[0];
        for(int i=1;i<n;i++){
            int num = arr[i];
            if(num<0){
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            currMax = Math.max(arr[i],currMax*arr[i]);
            currMin = Math.min(arr[i],currMin*arr[i]);
            maxPro = Math.max(maxPro,currMax);
        }
        return maxPro;
    }
}