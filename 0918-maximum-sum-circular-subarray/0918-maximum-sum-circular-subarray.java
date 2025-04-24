class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int max_straight_sum = Integer.MIN_VALUE;
		int min_straight_sum = Integer.MAX_VALUE;
		int total_array_sum = 0;
		int temp_maxSum = 0;
		int temp_minSum = 0;
		
		for(int i = 0 ; i < nums.length ; i++) {
			
			total_array_sum = total_array_sum + nums[i];
			
			temp_maxSum = temp_maxSum + nums[i];
			temp_minSum = temp_minSum + nums[i];
			
			if(temp_maxSum > max_straight_sum) {
				max_straight_sum = temp_maxSum;
			}
			
			if(temp_maxSum < 0) {
				temp_maxSum = 0;
			}
			
			if(temp_minSum < min_straight_sum) {
				min_straight_sum = temp_minSum;
			}
			
			if(temp_minSum > 0) {
				temp_minSum = 0;
			}
		}
		
		// if all numbers are negative then totalSum and minSum are equal, in that case we return maxSum
		if(total_array_sum == min_straight_sum) {
			return max_straight_sum;
		}
		return Math.max(max_straight_sum, total_array_sum - min_straight_sum);
    }
}