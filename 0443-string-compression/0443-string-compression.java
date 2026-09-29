class Solution {
    public int compress(char[] chars) {
        StringBuilder res = new StringBuilder();
        int count = 1;
        
        for (int i = 1;i<= chars.length;i++) {
            if (i == chars.length||chars[i]!=chars[i-1]) {
                res.append(chars[i-1]);
                
                if (count > 1) {
                    res.append(count);
                }
                count = 1;
            } else {
                count++;
            }
        }
        char[]compressedChars = res.toString().toCharArray();
        for (int i = 0; i<compressedChars.length;i++) {
            chars[i] = compressedChars[i];
        }
        return compressedChars.length;
    }
}