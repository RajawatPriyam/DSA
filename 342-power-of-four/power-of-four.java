class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i = 0; i < 32; i+=2){
            int mask = 1 << i;
            if(mask == n) return true;
        }
        return false;
    }
}