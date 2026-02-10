class Solution {
    public int search(int[] nums, int target) {
        int s = 0; int e = nums.length-1;
        return search(nums, target, s, e);

    }
    static int search(int[] nums, int target, int s, int e){
        if(s > e) return -1;
        int mid = s + (e-s)/2;

        if(nums[mid] == target) return mid;
        else if (nums[mid] < target) return search( nums, target, mid+1, e);
        return search( nums, target, s, mid-1);
    }
}