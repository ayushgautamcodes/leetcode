class Solution {
    public int romanToInt(String s) {
       int num = 0;
        
        for(int i = 0;i< s.length();i++){
            if(s.charAt(i) == 'M'){
                num = num + 1000;
            }
            if(s.charAt(i) == 'D'){
                num = num + 500;
            }
            if (s.charAt(i) == 'C') {
                    if (i < s.length() - 1 && s.charAt(i + 1) == 'M') {
                        num += 900;
                        i++;
                    }
                    else if (i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                        num += 400;
                        i++;
                    }
                    else {
                        num += 100;
                    }
                }
            if(s.charAt(i) == 'L'){
                num = num + 50;
            }
            
            if (s.charAt(i) == 'X') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    num += 90;
                    i++;
                }
                else if (i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                    num += 40;
                    i++;
                }
                else {
                    num += 10;
                }
            }
            
            if(s.charAt(i) == 'V'){
                num = num + 5;
            }
            if (s.charAt(i) == 'I') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'X') {
                    num += 9;
                    i++;
                }
                else if (i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                    num += 4;
                    i++;
                }
                else {
                    num += 1;
                }
            }
        }
        return num;
    }
}