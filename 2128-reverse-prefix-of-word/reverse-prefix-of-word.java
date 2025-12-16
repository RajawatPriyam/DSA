class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch) +1;
        String sb = new StringBuilder(word.substring(0,idx)).reverse().toString();
        
        return sb + word.substring(idx);
    }
}