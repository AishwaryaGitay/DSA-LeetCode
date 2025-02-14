class Solution {
    public String reverseVowels(String s) {
        
        int start = 0;
    	 int end = s.length() - 1;
    	 List<Character> vowelsList = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
    	 StringBuilder str = new StringBuilder(s);

         while(start <= end) {
            if(vowelsList.contains(str.charAt(start)) && vowelsList.contains(str.charAt(end))) {
    			 char temp = str.charAt(start);
    			 str.setCharAt(start, str.charAt(end));
    			 str.setCharAt(end, temp);
    			 
    			 start++;
    			 end--;
    		 } else if(!(vowelsList.contains(str.charAt(start)))) {
    			 start++;
    		 } else {
    			 end--;
    		 }
    	 }
    	 
    	 return str.toString();
    }
}