class Solution {
    public int findMin(int[] nums) {
        if (nums[0] <= nums[nums.length - 1])
            return nums[0];
        else return findPivot(nums);
    }

    private int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1])
                return nums[mid+1];
            else if (nums[mid] < nums[mid - 1])
                return nums[mid];

            else if (nums[start] < nums[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}