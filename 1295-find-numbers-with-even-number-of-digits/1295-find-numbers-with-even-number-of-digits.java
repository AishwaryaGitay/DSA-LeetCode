class Solution {
    public int findNumbers(int[] nums) {
         	
    	int count = 0;
    	for(int  i = 0 ; i < nums.length ; i++) {
    		if(even(nums[i])) {
    			count++;
    		}
    	}
    	return count;   
    }

    private boolean even(int num) {
		
		int digits = getDigits(num);
		return digits % 2 == 0;
	}

    private int getDigits(int num) {
		
		if(num == 0) {
			return 1;
		}
        return String.valueOf(Math.abs(num)).length();
    }
}