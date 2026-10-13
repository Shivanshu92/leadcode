class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int currSum = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            currSum = currSum + arr[i];
            
            int required = currSum - k;
            if(map.containsKey(required)){
                count = count + map.get(required);
            }
            map.put(currSum,map.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}