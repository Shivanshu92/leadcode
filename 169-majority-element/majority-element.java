class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            int count = map.getOrDefault(num,0)+1;
            map.put(num,count);

            if(count>n/2){
               return num;
            }
        }
        return -1;
    }
}