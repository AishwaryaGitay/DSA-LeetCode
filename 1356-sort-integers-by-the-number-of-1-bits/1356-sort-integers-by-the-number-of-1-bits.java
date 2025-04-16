class Solution {
    public int[] sortByBits(int[] arr) {
        
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
	    	Arrays.sort(boxedArr, (a, b) -> {
	    		int bitA = countNoOfSetBits(a);
	    		int bitB = countNoOfSetBits(b);
	    		
	    		if(bitA != bitB) {
	    			return bitA - bitB;
	    		} else {
	    			return a - b;
	    		}
	    	});
	    	
	    	return Arrays.stream(boxedArr).mapToInt(i -> i).toArray();
    }


    private int countNoOfSetBits(Integer num) {
			
			int count = 0;
			while(num > 0) {
				num = num & (num - 1);
				count++;
			}
			
			return count;
		}
}