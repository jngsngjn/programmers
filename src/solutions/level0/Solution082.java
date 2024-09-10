package solutions.level0;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181855
 */
class Solution082 {
    public int solution(String[] arr) {
        Map<Integer, Integer> map = new HashMap<>(); // length : count
        for (String s : arr) {
            int length = s.length();
            map.put(length, map.getOrDefault(length, 0) + 1);
        }

        int max = 0;
        for (Integer value : map.values()) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}