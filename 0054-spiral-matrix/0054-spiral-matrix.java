class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int strcol=0;
        int endcol = matrix[0].length -1;
        int strrow = 0;
        int endrow = matrix.length-1;
        
        List<Integer> spiral = new ArrayList<>();

        while(strrow <= endrow && strcol <= endcol){
            for(int i = strcol ; i<=endcol;i++){
                spiral.add(matrix[strrow][i]);
            }
            for(int i = strrow +1;i<=endrow;i++ ){
                spiral.add(matrix[i][endcol]);
            }
            if(strrow < endrow){
                for(int i =endcol-1;i>=strcol;i--){
                    spiral.add(matrix[endrow][i]);
                }
            }
            if(strcol<endcol){
                for(int i = endrow-1;i>strrow;i--){
                    spiral.add(matrix[i][strcol]);
                }
            }
            strrow++;
            strcol++;
            endrow--;
            endcol--;
        }
        return spiral;
    }
}