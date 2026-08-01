class Solution {
    public boolean isPalindrome(int x) {
        int ori = x;
        int rev = 0;
        while(x>0){
            int ld = x % 10;
            rev = rev * 10 + ld;
            x = x/10;
        }
        if(rev == ori){
            return true;
        }else{
            return false;
        }
    }
}