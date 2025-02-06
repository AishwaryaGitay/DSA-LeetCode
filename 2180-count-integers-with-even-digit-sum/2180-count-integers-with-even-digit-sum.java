class Solution {
    public int countEven(int num) {
        int count = 0;

    	for(int i = 2 ; i <= num ; i++) {
    		
    		if(evenSum(i)) {
    			count++;
    		}
    	}
    	return count;
    }

    private boolean evenSum(int num) {
		
    	int sum = 0;
    	 while(num > 0) {
    		 sum = sum + num % 10;
    		 num = num/10;
    	 }
		return (sum&1)==0 ? true : false;
	}
}