class Solution {
    public String sortSentence(String s) {
        
        String[] words = s.split(" ");
		String[] result = new String[words.length];
			
			for(int i = 0 ; i < words.length ; i++) {
				int len = words[i].length();
				int position = words[i].charAt(len - 1) - '0';
				String actualWord = words[i].substring(0, len - 1);
				result[position - 1] = actualWord;
			}
			
			return String.join(" ", result);
    }
}