package xyz.lanyi.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) {
            return 1;
        }
        char[] chars = s.toCharArray();
        int begin = 0;
        int end = 0;
        int maxLength = 1;
        Map<Character, Integer> map = new HashMap<>();
        while (end < chars.length) {
            if(map.containsKey(chars[end])) {
                begin = map.get(chars[end]) + 1;
            }
            maxLength = Math.max(maxLength, end - begin + 1);
            map.put(chars[end], end);
            end++;
        }
        return maxLength;
    }
}
