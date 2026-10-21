class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ele:tasks){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int maxFreq = 0;
        for(int freq : map.values()){
            maxFreq = Math.max(maxFreq,freq);
        }
        int maxCount = 0;
        for(int freq : map.values()){
            if(maxFreq==freq){
                maxCount++;
            }
        }
        int result = (maxFreq-1)*(n+1) + maxCount;
        return Math.max(tasks.length,result);
    }
}