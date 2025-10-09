class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = 0; int count2 = 0;
        int n = s.length()/2;
        for(int i = 0; i < n; i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+n);
            if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' || ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U') count2++;
            if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U') count1++;
        }

        return count1 == count2;
    }
}