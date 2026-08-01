class Solution {
    public int numberOfMatches(int n) {
        int matches = n/2;
            if(n%2==0){
                n = (n/2)-1;
                matches += n;
            }
            else if(n%2!=0){
                n = (n - 1) / 2;
                matches += n;
            }
        return matches;
    }
}