class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        String reverse = "";
        for ( int i = s.length() -1 ; i>=0;i--){
            reverse = reverse + s.charAt(i);
        }
        if(reverse.equals(s)){
            return true;
        }else{
            return false;
        }
    }
}