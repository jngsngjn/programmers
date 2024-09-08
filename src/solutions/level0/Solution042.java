package solutions.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181885
 */
class Solution042 {
    public String[] solution(String[] todo, boolean[] finished) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                result.add(todo[i]);
            }
        }
        return result.toArray(new String[0]);
    }
}