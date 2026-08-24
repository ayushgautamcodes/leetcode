class Solution {
    public boolean checkPerfectNumber(int num) {
        boolean ans;
        int total = 0;
        int i = 1;
        while(i<num){
            if(num%i==0){
                total+=i;
                i++;
            }else{
                i++;
            }
        }
        if(total != num){
            ans = false;
        }else{
            ans = true;
        }
        return ans;
    }
}