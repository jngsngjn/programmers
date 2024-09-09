package solutions.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181862
 */
class Solution081 {
    public String[] solution(String str) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'b' || c == 'c') {
                if (sb.length() > 0) {
                    result.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(c);
            }
        }

        if (sb.length() > 0) {
            result.add(sb.toString());
        }

        if (result.size() == 0) {
            return new String[]{"EMPTY"};
        }
        return result.toArray(new String[0]);
    }
}