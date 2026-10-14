class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int m = speed.length;
        int[][] ans = new int[n][2];
        Stack<Double> st = new Stack<>();
        for(int i=0;i<n;i++){
            ans[i][0] = position[i];
            ans[i][1] = speed[i];
        }
        Arrays.sort(ans,(a,b)-> Integer.compare(a[0],b[0]));
        for(int i = n-1; i>=0;i--){
            double time = (double)(target - ans[i][0])/(ans[i][1]);
            if(st.isEmpty() || time > st.peek()){
                st.push(time);
            }
        }
        return st.size();
    }
}