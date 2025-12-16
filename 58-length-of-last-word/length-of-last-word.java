class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(s.contains(" ")){
            
            String sb = new StringBuilder(s).reverse().toString();
            int idx = sb.indexOf(" ");
            sb = s.substring(0,idx);
            return sb.length();
        }
        else return s.length();
    }
}