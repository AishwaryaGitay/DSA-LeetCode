class Solution {
    public List<Integer> findDuplicates(int[] nums) {

      int i = 0;
    	List<Integer> result = new ArrayList<Integer>();
    	while(i < nums.length) {
    		
    		int correctIndex = nums[i] - 1;
    		
    		if(nums[i] != nums[correctIndex]) {
    			
    			int temp = nums[i];
    			nums[i] = nums[correctIndex];
    			nums[correctIndex] = temp;
    		} else {
    			i++;
    		}
    	}
    	
    	for(int j = 0 ; j < nums.length ; j++) {
    		if(nums[j] != j+1) {
    			result.add(nums[j]);
    		}
    	}
    	
    	return result;  
    }
}