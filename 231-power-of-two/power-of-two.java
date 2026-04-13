class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 0) return false;
        for(int i = 0; i < 32; i++){
            int mask = 1 << i;
            if( mask == n) return true;
        }
        return false;
    }
}