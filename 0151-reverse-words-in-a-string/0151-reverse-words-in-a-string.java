class Solution {
    public String reverseWords(String s) {
        String str = s.strip();
        int i = str.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i>=0){
            if(str.charAt(i)==' '){
                i--;
                continue;
            }
            int j = i;
            while(j>=0 && str.charAt(j)!=' '){
                j--;
            }
            sb.append(str.substring(j + 1, i + 1));
            sb.append(" ");
            i=j;
        }
        return sb.toString().strip();

    }
}