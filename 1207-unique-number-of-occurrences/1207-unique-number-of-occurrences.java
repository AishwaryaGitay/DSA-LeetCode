class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer,Integer> occMap = new HashMap<Integer, Integer>();	
			Set<Integer> occSet = new HashSet<Integer>();
			
			for(int i = 0 ; i < arr.length ; i++) {
				if(!occMap.containsKey(arr[i])) {
					int occ = 1;
					for(int j = i+1 ; j < arr.length ; j++) {
						if(i < arr.length - 1 && arr[i] == arr[j]) {
							occ++;
						}
					}
					occMap.put(arr[i], occ);
					if(!occSet.add(occ)) {
						return false;
					}
				}
			}
			
			return true;
    }
}