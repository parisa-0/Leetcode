class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>();
        
         for(int i = 0; i < strs.length; i++) {
            char[] strsToCharArray = strs[i].toCharArray();
            Arrays.sort(strsToCharArray);
            String sortedWord = new String(strsToCharArray);
            
            if (!myMap.containsKey(sortedWord)) {
                myMap.put(sortedWord, new ArrayList<>());
            }
            
            myMap.get(sortedWord).add(strs[i]);
        }
        
        return new ArrayList<>(myMap.values());
    }
}
