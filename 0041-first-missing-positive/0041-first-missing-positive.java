class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int i = 0;
    	
    	while(i < nums.length) {
    		
    		int correctIndex = nums[i] - 1;
    		
    		//ignore negative numbers and numbers greater than length of the array like 7, 8 etc
    		if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
    			
    			int temp = nums[i];
    			nums[i] = nums[correctIndex];
    			nums[correctIndex] = temp;
    		} else {
    			i++;
    		}
    	}
    	
    	for(int j = 0; j < nums.length ; j++) {
    		if(nums[j] != j+1) {
    			return j+1;
    		}
    	}
    	
    	return nums.length + 1;//if all the numbers are present at their correct position like 1,2,3,4 then return arr.length + 1 - that is 5 here
    
    }
}