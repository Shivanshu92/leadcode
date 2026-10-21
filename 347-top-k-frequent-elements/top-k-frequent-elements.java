class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> Integer.compare(a[1],b[1]));
        for(int ele:map.keySet()){
            int freq = map.get(ele);
            pq.add(new int[]{ele,freq});
            if(pq.size()>k){
                pq.remove();
            }
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.remove()[0];
        }
        return ans;
    }
}