class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);
            else
                i++;
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != (i + 1))
                ans.add(i + 1);
        }
        return ans;
    }

    private void swap(int[] nums, int first, int second) {
        {
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
    }
}