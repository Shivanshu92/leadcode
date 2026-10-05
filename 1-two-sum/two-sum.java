class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int num = target - arr[i];
            if(map.containsKey(num)){
                return new int[]{map.get(num),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}