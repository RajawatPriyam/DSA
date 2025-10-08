class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];
        int i = 0;
        for(String word : words){
            i = (int) (word.charAt(word.length() -1) - '0');
            ans[i-1] = word.substring(0, word.length()-1);
        }

        // for( i = 0; i < ans.length-1; i++){
        //     result.append(ans[i] + " ");
        // }
        // result.append(ans[i]);
        // return result.toString();

        return String.join(" ", ans);
    }
}