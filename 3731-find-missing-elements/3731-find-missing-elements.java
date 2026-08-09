class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<n-1;i++){
            if(nums[i]+1==nums[i+1]){
                continue;
            }else{
                int next =nums[i]+1;
                while(next<nums[i+1]){
                    ans.add(next);
                    next++;
                }
            }
        }
        
        return ans;
    }
}