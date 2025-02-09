class Solution {
    public boolean checkValid(int[][] matrix) {
        
        Set<Integer> ansSet;
			
			for(int i = 0 ; i < matrix.length ; i++) {
				ansSet = new HashSet<Integer>();
				for(int j = 0 ; j < matrix.length ; j++) {
					if(!(matrix[i][j] >= 1 && matrix[i][j] <= matrix.length && ansSet.add(matrix[i][j]))) {
						return false;
					}
				}
				ansSet = new HashSet<Integer>();
				for(int k = 0 ; k < matrix.length ; k++) {
					if(!(matrix[k][i] >=1 && matrix[k][i] <= matrix.length && ansSet.add(matrix[k][i]))) {
						return false;
					}
				}
			}
			
			return true;
    }
}