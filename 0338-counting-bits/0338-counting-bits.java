class Solution {
    public int[] countBits(int n) {
        
        int[] arr = new int[n+1];

	        for(int i = 0 ; i < arr.length ; i++){
	            int count = 0;
	            int a = i;
	            while(a > 0){
	                if((a & 1) == 1){
	                    count = count + 1;
	                }
	                a = a >> 1;
	            }
	            arr[i] = count;
	        }

	        return arr;
    }
}