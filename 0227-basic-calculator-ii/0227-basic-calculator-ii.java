class Solution {
    public int calculate(String s) {
        if (s == null || s.isEmpty()) return 0;
        int n = s.length();
        long currdigit = 0;
        int lastdigit = 0;
        char lastop = '+';
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                currdigit = currdigit * 10 + (c-'0');
            }
            if((!Character.isDigit(c)&& c!= ' ')||i==n-1){
                if(lastop == '+'){
                    ans += lastdigit;
                    lastdigit = (int)currdigit;
                }else if(lastop == '-'){
                    ans += lastdigit;
                    lastdigit = (int)-currdigit;
                }else if(lastop == '*'){
                    
                    lastdigit *= currdigit;
                }else if(lastop == '/'){
                    
                    lastdigit /= currdigit;
                }
                lastop = c;
                currdigit = 0;
            }
        }
        ans += lastdigit;
        return ans;
    }
}