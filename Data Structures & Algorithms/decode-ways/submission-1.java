class Solution {
    public int numDecodings(String s) {
 if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        
        dp[0] = 1;  // Empty string
        dp[1] = 1;  // First character is valid since it's not '0'
                for (int i = 2; i <= n; i++) {
            char one = s.charAt(i - 1);
            char two = s.charAt(i - 2);

            // One digit (last character)
            if (one != '0') {
                dp[i] += dp[i - 1];
            }

            // Two digit number
            int twoDigit = (two - '0') * 10 + (one - '0');
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}
