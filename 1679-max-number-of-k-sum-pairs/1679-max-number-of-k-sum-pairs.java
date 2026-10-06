class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length -1;
        int counter = 0;
        while(left<right){
            int current = nums[left]+nums[right];
            if(current == k){
                counter++;
                left++;
                right--;

            }else if(current>k){
                right--;
            }else{
                left++;
            }
        }
        return counter;
    }
}