class Solution {
    public int largestInteger(int num) {
        

        char[] charNum = String.valueOf(num).toCharArray();
    		
    		for(int i = 0; i < charNum.length ; i++) {
    			for(int j = i + 1; j < charNum.length ; j++) {
    				if(charNum[j] > charNum[i] && (charNum[j] - charNum[i]) % 2 == 0) {
    					char temp = charNum[i];
    					charNum[i] = charNum[j];
    					charNum[j] = temp;
    				}
    			}
    			
    		}
    		return Integer.parseInt(String.valueOf(charNum));
    }
}