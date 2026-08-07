class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int startcol = 0;
        int endcol = matrix[0].length - 1;
        int startrow = 0;
        int endrow = matrix.length - 1;
        int num =1;
        while(startrow <= endrow && startcol <= endcol){

            for( int i = startcol;i <= endcol;i++ ){
                (matrix[startrow][i]) =num++;
            }
            for( int j = startrow +1; j<=endrow ;j++){
                (matrix[j][endcol])=num++;
            }
            for(int i = endrow -1; i >= startcol;i-- ){
                if(startrow == endrow) break;
                (matrix[endrow][i])=num++;
            }
            for(int j = endrow-1; j > startrow;j--){
                if(startcol == endcol) break;
                (matrix[j][startcol])=num++;
            }
            startcol ++;
            startrow ++;
            endcol--;
            endrow--;
        }
        
        return matrix;

         
    }
}