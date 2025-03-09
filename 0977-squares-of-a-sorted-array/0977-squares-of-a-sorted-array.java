class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] ans = new int[nums.length];
    		int start = 0;
    		int end = nums.length - 1;
    		int index = nums.length - 1;
    		
    		while(start <= end && index >= 0) {
    			if(Math.abs(nums[start]) >= Math.abs(nums[end])) {
    				ans[index] = nums[start] * nums[start];
    				start++;
    				index--;
    			} else {
    				ans[index] = nums[end] * nums[end];
    				end--;
    				index--;
    			}
    		}
    		
    		return ans;
    }
}