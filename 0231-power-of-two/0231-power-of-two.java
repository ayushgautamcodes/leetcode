class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean res = true;
        if(n<=0){
            return res = false;
        }
        while(n%2 ==0){
            n = n /2;
        }
        return res = n == 1;

    }
}