class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n = words.length;
        int np = 0;

        for(int i = 0; i < n; i++){
            for( char ch : words[i].toCharArray()){
                if(!allowed.contains(String.valueOf(ch))){
                    np++;
                    break;
                }
            }
        }
        return n-np;
    }
}