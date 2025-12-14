class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        char[] sb = s.toLowerCase().toCharArray();
        for(int i = 0; i < sb.length; i++){
            if(sb[i] >= 'a' && sb[i] <= 'z' || sb[i] >= '0' && sb[i] <= '9'){
                result.append(sb[i]);
            }
        }
        return result.toString().equals(result.reverse().toString());
    }
}