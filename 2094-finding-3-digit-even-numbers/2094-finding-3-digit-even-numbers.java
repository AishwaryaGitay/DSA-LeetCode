class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] requiredDigitCount = countGivenDigits(digits);
	    	if(requiredDigitCount[0] == 0 && requiredDigitCount[2] == 0 && requiredDigitCount[4] == 0 && requiredDigitCount[6] == 0 && requiredDigitCount[8] == 0) {
	    		return new int[] {};
	    	}
	    	List<Integer> resultList = new ArrayList<Integer>();
	    	
	    	for(int num = 100 ; num < 1000 ; num = num +2) {
	    		
	    		int[] availableDigitCount = getAvailableDigits(num);
	    		
	    		if(isPossibleAnswer(availableDigitCount,requiredDigitCount)) {
	    			resultList.add(num);
	    		}
	    	}
	    	
	    	return resultList.stream().mapToInt(Integer::intValue).toArray();
    }


    private static boolean isPossibleAnswer(int[] availableDigitCount, int[] requiredDigitCount) {
			
			for(int i = 0 ; i < 10 ; i++) {
				if(requiredDigitCount[i] < availableDigitCount[i]) {
					return false;
				}
			}
			return true;
		}



		private static int[] getAvailableDigits(int num) {
			
			int[] availableDigitCount = new int[10];
			
			while(num > 0) {
				int rem = num % 10;
				availableDigitCount[rem]++;
				num = num/10;
			}
			return availableDigitCount;
		}



		private static int[] countGivenDigits(int[] digits) {
			
			int[] counter = new int[10];
			
			for(int i = 0 ; i < digits.length ; i++) {
				counter[digits[i]] = counter[digits[i]]+1;
			}
			return counter;
		}
}