class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
			int colMax = 0;
			int col = 0;
			
			for(int i = 0 ; i < matrix.length ; i++) {
				int rowMin = Integer.MAX_VALUE;
				for(int j = 0 ; j < matrix[i].length ; j++) {
					if(matrix[i][j] < rowMin) {
						rowMin = matrix[i][j];
						col = j;
					}
				}
				colMax = rowMin;
				for(int k = 0 ; k < matrix.length ; k++) {
					if(matrix[k][col] > rowMin) {
						colMax = matrix[k][col];
					} 
				}
				
				if(rowMin == colMax) {
					list.add(rowMin);
				}
			}
			
			return list;
    }
}