class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<m;i++){
            while(!st.isEmpty() && st.peek()<arr2[i]){
                map.put(st.pop(),arr2[i]);
            }
            st.push(arr2[i]);
        }
        while(!st.isEmpty()){
            map.put(st.pop(),-1);
        }
        for(int i=0;i<n;i++){
            ans[i] = map.get(arr1[i]);
        }
        return ans;
    }
}