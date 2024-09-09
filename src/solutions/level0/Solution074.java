package solutions.level0;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181866
 */
class Solution074 {
    public String[] solution(String str) {
        String[] parts = str.split("x");
        List<String> result = new ArrayList<>();

        for (String part : parts) {
            if (!part.isEmpty()) {
                result.add(part);
            }
        }
        Collections.sort(result);
        return result.toArray(new String[0]);
    }
}