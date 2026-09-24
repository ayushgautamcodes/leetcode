class Solution {
    public String reverseVowels(String s) {
        int f = 0;
        int l = s.length()-1;
        char[] chars = s.toCharArray();
        String vovels = "aeiouAEIOU";
        while(f<l){
            if(vovels.indexOf(chars[f]) == -1){
                f++;
                continue;
            }
            if(vovels.indexOf(chars[l])==-1){
                l--;
                continue;
            }
            char temp = chars[f];
            chars[f] = chars[l];
            chars[l] = temp;
            f++;
            l--;
        }

        return new String (chars);
    }
}