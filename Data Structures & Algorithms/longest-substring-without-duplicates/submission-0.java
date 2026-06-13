class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max_length = 0;
        int i = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (!set.contains(c)) {
               set.add(c);  
               max_length = Math.max(j - i + 1, max_length); 
            } else {
                while (set.contains(c)) {
                    set.remove(s.charAt(i++));
                }
                set.add(c);
            }
        }
        return max_length;
    }
}
