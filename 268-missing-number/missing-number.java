class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(correct == nums.length){
                i++;
                continue;
            }
            if(nums[i] != nums[correct]) swap(nums, i, correct);
            else i++;
        }
        for(i = 0; i<nums.length; i++){
            if(nums[i] != i) return i;
        }
        return nums.length;
    }

    private void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}