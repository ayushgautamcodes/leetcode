class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            List<Integer> sub = new ArrayList<>();
            if(i==0){
                sub.add(1);
                sol.add(sub);
                continue;
            }
            if(i==1){
                sub.add(1);
                sub.add(1);
                sol.add(sub);
                continue;
            }
            List<Integer> minone = sol.get(i-1);
            for(int j = 0; j<=i;j++){
                if(j==0||j==i){
                    sub.add(1);
                }else{
                    sub.add(minone.get(j)+minone.get(j-1));
                }
            }
            sol.add(sub);
        }
        return sol;
    }
}