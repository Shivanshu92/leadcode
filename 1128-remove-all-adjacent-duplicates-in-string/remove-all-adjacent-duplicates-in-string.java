class Solution {
    public String removeDuplicates(String s) {
        int m = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<m;i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek()==ch){ // not use while as we do not add the character after pop.
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}