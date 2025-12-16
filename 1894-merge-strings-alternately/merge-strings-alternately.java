class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0; int j = 0;
        StringBuilder sb = new StringBuilder();
        while( i < word1.length() && j < word2.length()){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++; j++;
        }
        if(word1.length() > word2.length()){
            return sb.append(word1.substring(i,word1.length())).toString();
        }
        else if(word1.length() < word2.length()){
            return sb.append(word2.substring(i,word2.length())).toString();
        }
        return sb.toString();
    }
}