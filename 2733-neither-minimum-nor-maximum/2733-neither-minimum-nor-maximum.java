class Solution {
    public int findNonMinOrMax(int[] nums) {
        

        if(nums.length <= 2) {
    			return -1;
    		}
    		
    		int ans = -1;
    		int min = Integer.MAX_VALUE;
    		int max = Integer.MIN_VALUE;
    		
    		for(int num : nums) {
    			if(num < min) {
    				min = num;
    			}
    			if(num > max) {
    				max = num;
    			}
    		}
    		
    		for(int no : nums) {
    			if(no != min && no != max) {
    				ans = no;
    				break;
    			}
    		}
    		
    		return ans;
    }
}