class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charss = s.toCharArray();
        Arrays.sort(charss);
        String sorteds = new String(charss);
        char[] charst = t.toCharArray();
        Arrays.sort(charst);
        String sortedt = new String(charst);
        
        return sorteds.equals(sortedt);
    }
}