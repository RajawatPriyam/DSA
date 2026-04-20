class Solution {
    public int myAtoi(String s) {
        int n = 0; int i = 0;
        boolean neg = false;
        s = s.trim();
        if(s.isEmpty()) return 0;
         
        if(s.charAt(i) == '-'){
            neg = true;
            i = 1;
        }
        else if(s.charAt(0) == '+'){
            neg = false;
            i = 1;
        }
        while(i < s.length()){

            if(!Character.isDigit(s.charAt(i))){
                break;
            }
            int digit = s.charAt(i) - '0';
            
            if(n > (Integer.MAX_VALUE - digit) /10){
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE ;
            }

            n = (n*10) + digit;
            i++;
        }
        return neg ? n* -1: n;
    }
}