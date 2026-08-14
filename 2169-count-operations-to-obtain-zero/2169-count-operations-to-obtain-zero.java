class Solution {
    public int countOperations(int num1, int num2) {
        int operation = 0;
        int n1 = num1;
        int n2 = num2;
        while(n1>0&&n2>0){
            if(n1>=n2){
                n1 = n1-n2;
                operation++;
            }else{
                n2 = n2-n1;
                operation++;
            }
        }
        return operation;
    }
}