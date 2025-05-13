class Solution {
    public boolean halvesAreAlike(String s) {
        
        String first = s.substring(0, s.length()/2).toLowerCase();
			String second = s.substring(s.length()/2, s.length()).toLowerCase();
			int cnt1 = 0;
			int cnt2 = 0;
			
			int counter = 0;
			while(counter < first.length()) {
				char ch1 = first.charAt(counter);
				char ch2 = second.charAt(counter);
				if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
					cnt1++;
				}
				
				if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u') {
					cnt2++;
				}
				
				counter++;
			}
			
			
			if(cnt1 == cnt2) {
				return true;
			}
			return false;
    }
}