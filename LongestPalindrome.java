class Solution {
    public int longestPalindrome(String s) {

        int count = 0;
        Map<Character, Integer> map = new HashMap<>();

        s.chars().forEach(c -> map.put((char) c, map.getOrDefault((char) c, 0) + 1));

        boolean hasSingleLetterCount = false;

        for (int v : map.values()) {
            if (v % 2 == 0) {
                count += v;
            } else {
                count += v - 1;
                hasSingleLetterCount = true;
            }
        }
        if (hasSingleLetterCount) {
            return ++count;
        }
        return count;
    }
}
