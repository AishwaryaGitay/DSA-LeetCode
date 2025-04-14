class Solution {
    public int findComplement(int num) {
        
        // if(num == 1){
        //     return 0;
        // }
        // int noOfDigs = (int)Math.floor(Math.log(num)/Math.log(2) +1);
        // //prevent overflow of number as well
        // int all1 = (int) (Math.pow(2, noOfDigs) - 1);

        // return num ^ all1;
        

        // OR

  // Another way - 
        
        int n = 0 ;
	    while(n < num) {
	    	n = n << 1 | 1;
	    }
	    
	    return n ^ num;
    }
}