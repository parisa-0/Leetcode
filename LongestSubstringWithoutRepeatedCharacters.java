class Solution {
    //https://www.baeldung.com/java-longest-substring-without-repeated-characters
    public int lengthOfLongestSubstring(String s) {   
    String output = "";
    for (int start = 0; start < s.length(); start++) {
        Set<Character> visited = new HashSet<>();
        int end = start;
        for (; end < s.length(); end++) {
            char currChar = s.charAt(end);
            if (visited.contains(currChar)) {
                break;
            } else {
                visited.add(currChar);
            }
        }
        if (output.length() < end - start + 1) {
            output = s.substring(start, end);
        }
    }
    return output.length();
}
}
