class Solution {
    public int findComplement(int num) {
        if (num == 0) return 1;
        long mask = 1;

        while( mask <= num){
            mask <<= 1;
        }
        return (int)(mask -1) ^ num;
    }
}