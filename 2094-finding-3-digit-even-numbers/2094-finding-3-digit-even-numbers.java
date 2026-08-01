class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> res =new TreeSet<>();
        int num = 0;
        for(int i =0;i<digits.length;i++){
            if(digits[i]==0)continue;
            for(int j =0;j<digits.length;j++){
                if(j==i)continue;
                    for(int k=0;k<digits.length;k++){
                        if(k==i||k==j)continue;
                        num = (digits[i]*100)+(digits[j]*10)+digits[k];
                        if(num%2==0){
                            res.add(num);
                        }
                    }
            }
            
        }
        int[] result = new int[res.size()];
        int idx = 0;
        for (int n : res) {
            result[idx++] = n;
        }
        return result;
    }
}