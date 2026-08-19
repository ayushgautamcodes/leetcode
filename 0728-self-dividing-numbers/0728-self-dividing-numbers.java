class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i = left;i<=right;i++){
            int num = i;
            boolean selfdivisible = true;
            while(num>0){
                int ld= num%10;
                if(ld == 0 || i%ld!=0){
                    selfdivisible = false;
                    break;
                }
                num /=10;
            }

            if(selfdivisible){
                ans.add(i);
            }
        }
        return ans;
    }
}