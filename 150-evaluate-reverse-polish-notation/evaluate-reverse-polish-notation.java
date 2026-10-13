class Solution {
    public int evalRPN(String[] str){
        int n = str.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            String ch = str[i]; 
            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")){
                st.push(Integer.parseInt(ch));
            }else{
                int upper = st.pop();
                int front = st.pop();
                if(ch.equals("+")){
                    st.push(front+upper);
                }
                else if(ch.equals("-")){
                    st.push(front-upper);
                }
                else if(ch.equals("*")){
                    st.push(front*upper);
                }
                else if(ch.equals("/")){
                    st.push(front/upper);
                }
            }
        }
        return st.peek();
    }
}