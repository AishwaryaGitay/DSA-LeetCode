class Solution {
    public int strStr(String haystack, String needle) {
        
        haystack = haystack.toLowerCase();
	    needle = needle.toLowerCase();
	
     int index = haystack.indexOf(needle);
	
	return index;
    }
}