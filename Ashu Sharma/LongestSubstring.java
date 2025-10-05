import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbbabcd";
        System.out.println(Solution(s)); // Output: "abc"
    }

    public static String Solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0, maxLen = 0, maxStart = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }

            map.put(c, end);

            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                maxStart = start;
            }
        }

        return s.substring(maxStart, maxStart + maxLen);
    }
}
