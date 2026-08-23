class Solution {
    public String convertToBase7(int num) {
        long ans = 0;
        long pv = 1;
        while(num!=0){
            long rem = num%7;
            ans = ans+(rem*pv);
            pv*=10;
            num/=7;
        }
        return (num<0 ? "-":"")+ans;
    }
}