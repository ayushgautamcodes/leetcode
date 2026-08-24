class Solution {
    public boolean checkPerfectNumber(int num) {
        boolean ans =  true;
        int total = 0;
        for(int i = 1;i<num;i++){
            if(num%i==0){
                total += i;
            }
        }
        if(total != num){
            ans = false;
        }
        return ans;
    }
}