class Solution {
    public int totalHammingDistance(int[] nums) {
        int total = 0;
        for(int i = 0; i<32; i++){
            int ones = 0;
            for(int num : nums){
                if(((num >> i) & 1) == 1) ones++;
            }

            int zeroes = nums.length - ones;
            total += ones * zeroes;
        }
        return total;
    }
}