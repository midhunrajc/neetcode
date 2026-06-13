class Solution {
    public String minWindow(String s, String t) {
        int right = 0, left = 0;
        int found = 0;
        
        int[] ans = {-1, 0 , 0};


        if (s.length() == 0 || t.length() == 0) {
            return new String();
        }

        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int required = tMap.size();

        Map<Character, Integer> sMap = new HashMap<>();
        while (right < s.length()) {
            char ctr = s.charAt(right);

            sMap.put(ctr, sMap.getOrDefault(ctr, 0) + 1);
            
            if (tMap.containsKey(ctr) && tMap.get(ctr) == sMap.get(ctr)) {
                found++;
            }

            while (left <= right && required == found) {
                if (ans[0] == -1 || right - left + 1 < ans[0]) {
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }
                char c = s.charAt(left);
                sMap.put(c, sMap.getOrDefault(c, 0) - 1);
                if (tMap.containsKey(c) && sMap.get(c) < tMap.get(c)) {
                    found--;
                }

                left++;
            }

            right++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);   

    }
}
