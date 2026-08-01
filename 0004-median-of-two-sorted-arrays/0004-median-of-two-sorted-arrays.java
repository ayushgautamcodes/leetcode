class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        int k = 0;

        for(int i = 0; i < nums1.length; i++) {
            merged[k++] = nums1[i];
        }

        for(int i = 0; i < nums2.length; i++) {
            merged[k++] = nums2[i];
        }

        Arrays.sort(merged);

        int n = merged.length;

        if(n % 2 == 1) {
            return merged[n / 2];
        } else {
            return (merged[n/2 - 1] + merged[n/2]) / 2.0;
        }
    }

    public void main(String[] args) {

        int[] nums1 = {1,3};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}