class Solution {
    public int numberOfSteps(int num) {
        
        	return helperForSteps(num, 0);
    }

	private int helperForSteps(int num, int count) {
		
		if(num == 0)
			return count;
		
		if(num % 2 == 0) {
			return  helperForSteps(num/2, count + 1);
		}
		else {
			return helperForSteps(num - 1, count + 1);
		}
	}
}