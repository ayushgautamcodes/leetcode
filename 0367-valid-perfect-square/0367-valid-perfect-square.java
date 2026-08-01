class Solution {
    public boolean isPerfectSquare(int num) {
        boolean res = true;
        if(num%Math.sqrt(num)== 0){
            return res= true;
        }else{
            return res = false;
        }
        
    }
}