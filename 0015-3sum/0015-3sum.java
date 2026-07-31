class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int p1 = 0; p1<n-2;p1++ ){
            if(p1>0&&nums[p1]==nums[p1-1]){
                continue;
            }
            int p2 = p1+1;
            int p3 = n-1;
            while(p2<p3){
                int sum =nums[p1] + nums[p2] + nums[p3];
                if (sum == 0){
                    List<Integer> elem = new ArrayList<>();
                    elem.add(nums[p1]);
                    elem.add(nums[p2]);
                    elem.add(nums[p3]);
                    Collections.sort(elem);
                    result.add(elem);
                    p2++;
                    p3--;
                    while(p2<p3&&nums[p2]==nums[p2-1]){
                        p2++;
                    }
                    while(p2<p3&&nums[p3]==nums[p3+1]){
                        p3--;
                    }

                }else if(sum<0){
                    p2++;
                }else{
                    p3--;
                }
            }
        }
        return result;
    }
}