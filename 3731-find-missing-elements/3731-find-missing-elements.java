class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]+1){
                continue;
            }
            int next = nums[i]+1;
            while(next<nums[i+1]){
                ans.add(next);
                next++;
            }
        }
        return ans;
    }
}