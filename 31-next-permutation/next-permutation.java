class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1; int n = nums.length; int i;

        for( i = n-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1) reverse(0, n-1, nums);
        else{
            for(i = n-1; i > idx; i--){
                if(nums[i] > nums[idx]){
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                    break;
                }
            }
            reverse(idx+1, n-1, nums);
        } 
        
    }
    static void reverse(int left, int right, int[] nums){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}