class Solution {
    public String predictPartyVictory(String s) {
        int n = s.length(); 
        Queue<Integer> radient = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='R'){
                radient.offer(i);
            }
            else{
                dire.offer(i);
            }
        }
        
        while(!radient.isEmpty() && !dire.isEmpty()){
            int r = radient.poll();
            int d = dire.poll();

            if(r<d){
                radient.offer(r+n);
            }
            else{
                dire.offer(d+n);
            }
        }
        return radient.isEmpty() ? "Dire" : "Radiant";
    }
}