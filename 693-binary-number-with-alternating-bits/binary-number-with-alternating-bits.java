class Solution {
    public boolean hasAlternatingBits(int n) {
        while( n > 0){
            int prev = n&1;
            n >>= 1;
            
            if (prev == (n&1)) return false;
        }
        return true;
    }
}