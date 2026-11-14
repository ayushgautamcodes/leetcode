class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> charStack = new Stack<>();

        int currnum = 0;
        String currchar = "";

        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                currnum = (currnum * 10) + (c - '0');
            }
            else if ( c== '['){
                numStack.push(currnum);
                charStack.push(currchar);

                currnum = 0;
                currchar = "";
            }
            else if (c==']'){
                int repnum = numStack.pop();
                String prevchar = charStack.pop();

                String reppart = "";
                for(int j = 0;j<repnum;j++){
                    reppart = reppart+currchar;
                }
                currchar = prevchar +reppart;
            }
            else{
                currchar+=c;
            }


        }
        return currchar;

    }
}