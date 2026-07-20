class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grams = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] stringArr = strs[i].toCharArray();
            Arrays.sort(stringArr);
            String sortedKey = new String(stringArr);

            // If the key isn't there, add a new empty list
            if (!grams.containsKey(sortedKey)) {
                grams.put(sortedKey, new ArrayList<>());
            }
            
            // Add the ORIGINAL word (strs[i]) to the list for that sorted key
            grams.get(sortedKey).add(strs[i]);
        }
        return new ArrayList<>(grams.values());
    }
}