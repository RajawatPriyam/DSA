class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while( i < nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else i++;
        }
        for(i = 0; i < nums.length; i++){
            if(nums[i] != (i+1)) ans.add(nums[i]);
        }
        return ans;
    }
}