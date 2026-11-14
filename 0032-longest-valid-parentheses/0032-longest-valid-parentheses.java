class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int valcount = 0;
        stack.push(-1);
        if(s.length()==0){
            return 0;
        }
        for(int i = 0 ; i<s.length();i++){
            char c = s.charAt(i);

            if(c=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    int currentLength = i - stack.peek();
                    valcount = Math.max(valcount,currentLength);
                }
                
                
            }
            
        }
        return valcount;
    }
}