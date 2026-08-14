class Solution {
    public boolean isSameAfterReversals(int num) {
        int ans = 0;
        int finans=0;
        int orig = num;
        
        
        while(num>0){
            int ld=num%10;
            ans = (ans*10)+ld;
            num= num/10;
        }
        while(ans>0){
            int ld2=ans%10;
            finans = (finans*10)+ld2;
            ans= ans/10;
        }
        return finans==orig;
    }
}