class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
		        Map<String, Integer> countMap = new HashMap<>();
		        String[] words = paragraph.replaceAll("\\W+" , " ").toLowerCase().split("\\s+");
		        for (String w : words) {
		        	if (!ban.contains(w)) {
		        		countMap.put(w, countMap.getOrDefault(w, 0) + 1);
		        	}
		        }
		        return Collections.max(countMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}