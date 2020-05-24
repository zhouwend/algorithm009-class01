class Solution {
    public void rotate(int[] nums, int k) {
        if(k > nums.length) {
            k = k%nums.length;
        }
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    public void reverse(int[] nums, int start, int end) {
        int temp = 0;
        for(int i = start; i < end; i++) {
            temp = nums[i];
            nums[i] = nums[end];
            nums[end] = temp;
            end--;
        }
    }
}