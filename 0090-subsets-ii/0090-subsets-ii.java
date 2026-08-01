class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,0,new ArrayList<>());
        return res;
    }
    public void backtrack(int[] nums ,int index,List<Integer> subset){
        if(index == nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        backtrack(nums,index+1,subset);
        subset.remove(subset.size()-1);
        int next = index + 1;
        while (next < nums.length && nums[next]== nums[index]){
            next++;
        }
        backtrack(nums,next,subset);
    }
}