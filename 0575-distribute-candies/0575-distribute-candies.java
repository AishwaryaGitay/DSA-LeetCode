class Solution {
    public int distributeCandies(int[] candyType) {
        
        int canEat = candyType.length/2;
    	 Set<Integer> set = new HashSet<Integer>();
    	 
    	 for(int candy : candyType) {
    		 set.add(candy);
    	 }
    	 
    	 if(set.size() < canEat) {
    		 return set.size();
    	 }
    	 return canEat;
    }
}