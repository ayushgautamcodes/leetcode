class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        int n = path.length();
        for(int i = 0;i<n;i++){
            if(path.charAt(i)=='/'){
                continue;
            }
            StringBuilder temp = new StringBuilder();
            while(i<n&& path.charAt(i)!='/'){
                temp.append(path.charAt(i));
                i++;
            }
            String ans = temp.toString();
            if(ans.equals(".")){
                continue;
            }
            else if(ans.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(ans);
            }
        }
        return "/" + String.join("/", stack);
    }
}