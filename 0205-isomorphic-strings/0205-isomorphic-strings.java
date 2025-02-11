class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Character> letterMap = new HashMap<Character, Character>();
				String res = "";
				for(int i = 0 ; i < t.length() ; i++) {
					if(!(letterMap.containsKey(s.charAt(i))) && !(letterMap.containsValue(t.charAt(i)))) {
						letterMap.put(s.charAt(i), t.charAt(i));
					}
					if(letterMap.containsKey(s.charAt(i))) {
						res = res+letterMap.get(s.charAt(i))+"";
					}else {
						return false;
					}
				}
				return res.equals(t);
    }
}