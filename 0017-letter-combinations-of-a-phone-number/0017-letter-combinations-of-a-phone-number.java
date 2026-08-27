class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        String[][] map ={ {},{},{"a","b","c"},    
            {"d","e","f"},     
            {"g","h","i"},     
            {"j","k","l"},     
            {"m","n","o"},    
            {"p","q","r","s"}, 
            {"t","u","v"},     
            {"w","x","y","z"} 
        };
        res.add("");
        int s = digits.length();
        for(int i = 0;i<s;i++){
            int dn = digits.charAt(i) -'0';
            String[] currlet = map[dn];
            List<String> temp = new ArrayList<>();
            for(String l1 : res){
                for(String l2 : currlet){
                    temp.add(l1+l2);
                }
            }
            res= temp;

        }
        return res;
    }
}