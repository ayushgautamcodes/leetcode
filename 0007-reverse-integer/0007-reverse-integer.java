class Solution {
    public int reverse(int x) {
        long k =0;
        while ( x!=0){
            int ld = x%10;
            k = k * 10 + ld;
            x=x/10;
        }
        if ( k > Integer.MAX_VALUE || k < Integer.MIN_VALUE){
            return 0;
        }
        return (int) k;
    }
}