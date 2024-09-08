package solutions.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181870
 */
class Solution058 {
    public String[] solution(String[] strArr) {
        List<String> result = new ArrayList<>();
        for (String s : strArr) {
            if (!s.contains("ad")) {
                result.add(s);
            }
        }
        return result.toArray(new String[0]);
    }
}