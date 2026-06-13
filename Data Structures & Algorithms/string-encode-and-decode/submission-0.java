class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length()).append('#').append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> arr = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int delimeter = str.indexOf('#', i);
            int val = Integer.parseInt(str.substring(i, delimeter));
            i = delimeter + 1;
            arr.add(str.substring(i, i + val));
            i += val;
        }

        //    List<String> arr = new ArrayList<>();
    // int i = 0;

    // while (i < str.length()) {
    //     int delimiter = str.indexOf('#', i);
    //     int val = Integer.parseInt(str.substring(i, delimiter));
    //     i = delimiter + 1;
    //     arr.add(str.substring(i, i + val));
    //     i += val; // advance to the next part
    // }

   /// return arr;

        return arr;
    }
}
