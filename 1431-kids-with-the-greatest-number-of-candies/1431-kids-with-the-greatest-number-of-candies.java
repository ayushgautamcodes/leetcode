class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res = new ArrayList<>();
        int max = findMax(candies); 
        for(int i = 0;i<candies.length;i++){
            res.add(candies[i]+extraCandies>=max);
        }
        return res;
    }
    private int findMax(int[] candies) {
        int max = Arrays.stream(candies).max().getAsInt();
    return max;
    }
}