class Solution {
    public boolean judgeSquareSum(int c) {
        boolean ans = false;
        long left = 0;
        long right = (long) Math.sqrt(c);
        while(left<=right){
            long num = (left*left)+(right*right);
            if(num == c){
                ans = true;
                break;
            }else if(num<c){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}