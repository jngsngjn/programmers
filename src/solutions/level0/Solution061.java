package solutions.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181868
 */
class Solution061 {
    public String[] solution(String str) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            } else if (sb.length() > 0) {
                result.add(sb.toString());
                sb.setLength(0);
            }
        }

        if (sb.length() > 0) {
            result.add(sb.toString());
        }
        return result.toArray(new String[0]);
    }
}