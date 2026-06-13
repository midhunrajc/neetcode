class Solution {
    public boolean isValid(String s) {
      
       Stack<Character> stk = new Stack<>();
       Map<Character, Character> map = new HashMap<>();

       map.put('}','{');
       map.put(']','[');
       map.put(')','(');


       for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsValue(c)) {
               stk.push(c);
            } else if (map.containsKey(c)) {
                if (stk.isEmpty()) return false;
                if(map.get(c) != stk.pop()) {
                    return false;
                }
            }
       }

       if (!stk.isEmpty()) return false;
         
        return true;
    }
}
