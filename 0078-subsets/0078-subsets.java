class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,0,new ArrayList<>());
        return result;
    }
    public void backtrack(int[]nums,int index,List<Integer>subset){
        if(index== nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        backtrack(nums, index+1, subset);
        subset.remove(subset.size()-1);
        backtrack(nums, index+1, subset);

    }
}