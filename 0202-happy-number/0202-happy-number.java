class Solution {
    public boolean isHappy(int n) {

      int sum = 0;
				Set<Integer> happySet = new HashSet<Integer>();
				
				while(n > 0) {
					int rem = n % 10;
					sum = sum + (rem*rem);
					n = n / 10;
					if(n <= 0 && sum != 1) {
						if(happySet.add(sum)) {
							n = sum;
							sum = 0;
						} else {
							return false;
						}
					}else if(n <= 0 && sum == 1) {
						return true;
					}
				}
				
				return false;
    }
}