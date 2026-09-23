class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        int num = n;
        for(int i = 0;i<l;i++){
            if(flowerbed[i]==0){
                if((i==l-1||flowerbed[i+1]==0)&&(i==0||flowerbed[i-1]==0)){
                    flowerbed[i]=1;
                    num--;
                }
            }
        }
        return num<=0;
    }
}