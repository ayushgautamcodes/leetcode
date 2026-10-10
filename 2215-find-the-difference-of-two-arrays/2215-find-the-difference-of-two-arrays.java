class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> sub1 = new ArrayList<>();
        List<Integer> sub2 = new ArrayList<>();
        for(int i = 0;i<nums1.length;i++){
            
            if (Arrays.binarySearch(nums2,nums1[i]) >= 0 || sub1.contains(nums1[i])){
                continue;
            }else{
                sub1.add(nums1[i]);
            }
           
        }
        for(int i = 0;i<nums2.length;i++){
            
            if (Arrays.binarySearch(nums1,nums2[i]) >= 0 || sub2.contains(nums2[i])){
                continue;
            }else{
                sub2.add(nums2[i]);
            }
           
        }
        ans.add(sub1);
        ans.add(sub2);
        return ans;
        
    }
}