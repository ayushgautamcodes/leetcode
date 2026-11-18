class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stk = new ArrayDeque<>();
        int n = tokens.length;
        for(int i = 0;i<n;i++){
            String tok = tokens[i];
            if(tok.equals("+")){
                stk.push(stk.pop()+stk.pop());
            }else if(tok.equals("-")){
                int r = stk.pop();
                int l = stk.pop();
                stk.push(l-r);
            }else if(tok.equals("*")){
                stk.push(stk.pop()*stk.pop());
            }else if(tok.equals("/")){
                int r = stk.pop();
                int l = stk.pop();
                stk.push(l/r);
            }else{
                stk.push(Integer.parseInt(tok));
            }
        }
        return stk.pop();

    }
}