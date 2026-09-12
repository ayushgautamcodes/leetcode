class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int first = 0;
        int last = n-1;
        while(first<last){
            int mid = (first+ last)/2;
            if(nums[mid]<nums[mid+1]){
                first = mid +1;
            }else{
                last = mid;
            }
        }
        
        
        return first;
        
    }
}