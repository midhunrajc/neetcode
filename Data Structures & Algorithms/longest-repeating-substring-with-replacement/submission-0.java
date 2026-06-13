class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int max_length = 0;
        int mostFreq = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            count[c - 'A']++;
            mostFreq = Math.max(mostFreq, count[c - 'A']);

            if ((right - left + 1) - mostFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            max_length = Math.max(max_length, right - left + 1);
        }

        return max_length;
    }
}
