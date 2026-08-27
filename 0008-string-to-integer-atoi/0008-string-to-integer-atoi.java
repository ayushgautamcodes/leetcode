class Solution {
    public int myAtoi(String s) {
        String st = s.trim();
        int n = st.length();
        long ans = 0;
        if(st.isEmpty()) {
            return 0; 
        }
        boolean isNigg = false;
        int sti = 0;
        
        if(st.charAt(0) == '-'){
            isNigg = true;
            sti = 1;
        }else if(st.charAt(0) == '+'){
            sti = 1;
        }
        for(int i = sti;i<n;i++){
            char c = st.charAt(i);
            if(Character.isDigit(c)){
                ans = (ans*10)+(c-'0');
            }
            if (!isNigg && ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (isNigg && -ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if(!Character.isDigit(c)){
                break;
            }
        }
        if(isNigg){
            ans *= -1;
        }
        return (int)ans;
    }
}