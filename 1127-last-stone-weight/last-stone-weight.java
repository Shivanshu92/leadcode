class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr){
            pq.add(ele);
        }
        while(pq.size()>=2){
            int first = pq.remove();
            int second = pq.remove();
            int diff = first-second; // always gives positive value as first is greater than second
            if(diff > 0){
                pq.add(diff);
            }
        }
        return pq.isEmpty()?0:pq.peek();
    }
}