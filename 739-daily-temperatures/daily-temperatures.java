class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length; 
        Stack<Integer> st = new Stack<>();
        int[] answer = new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){ // while is used as to pop all index which is smaller in the stack.
                int prev = st.pop();
                answer[prev] = i - prev;
            }
            st.push(i);
        }
        return answer;
    }
}