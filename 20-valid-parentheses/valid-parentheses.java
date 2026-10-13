class Solution {
    public boolean isValid(String s) {
        int m = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<m;i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                int top = st.pop();
                if(ch == ')' && top!='('){
                    return false;
                }
                else if(ch == '}' && top!='{'){
                    return false;
                }
                else if(ch == ']' && top!='['){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}