class Solution {
    public int largestPerimeter(int[] nums) {
        
        int ans = 0;
    		Arrays.sort(nums);
    		
    		for(int i = nums.length - 1; i >= 2 ; i--) {
    			
    			if(nums[i-2] + nums[i-1] > nums[i]) {
    				ans = nums[i-2]+nums[i-1]+nums[i];
    				break;
    			}
    		}
    		
    		return ans;
    }
}