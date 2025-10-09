class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = 0; int count2 = 0;
        int n = s.length()/2;
        for(int i = 0; i < n; i++){
            if(s.charAt(i + n) == 'a' || s.charAt(i + n) == 'e' || s.charAt(i + n) == 'i' || s.charAt(i + n) == 'o' || s.charAt(i + n) == 'u' || s.charAt(i + n) == 'A' || s.charAt(i + n) == 'E' || s.charAt(i + n) == 'I' || s.charAt(i + n) == 'O' || s.charAt(i + n) == 'U') count2++;
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') count1++;
        }

        return count1 == count2;
    }
}