class Solution {
    public int countPrimeSetBits(int left, int right) {

      int finalCount = 0;
	    	
	    	for(int i = left ; i <= right ; i++) {
	    		int count = countSetBits(i);  // - Instead of this function we made ,    we can also use in-built function - Integer.bitCount(num);
	    		
                if(checkIfPrime(count)) {
	    			finalCount++;
	    		}
	    		
	    	}
	    	
	    return finalCount;  
    }

    private int countSetBits(int num) {
			
	    	int sum = 0;
	    	
	    	while(num > 0) {
	    		if((num & 1) == 1) {
	    			sum = sum + 1;
	    		}
	    		num = num >> 1;
	    	}
			return sum;
		}

	    private boolean checkIfPrime(int num) {
			
	    	if(num < 2) {
	    		return false;
	    	}
	    	
	    	for(int i = 2 ; i * i <= num ; i++) {
	    		if(num % i == 0) {
	    			return false;
	    		}
	    	}
			return true;
		}
}