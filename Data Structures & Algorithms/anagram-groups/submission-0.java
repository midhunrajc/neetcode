class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String str_1 = new String(c);

            if (!map.containsKey(str_1)) {
                map.put(str_1, new ArrayList<>());
            }

            map.get(str_1).add(str);
        }

        return new ArrayList(map.values());
    }
}
