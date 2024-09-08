package solutions.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181867
 */
class Solution069 {
    public int[] solution(String str) {
        List<Integer> result = new ArrayList<>();
        int length = 0;

        for (char c : str.toCharArray()) {
            if (c != 'x') {
                length++;
            } else {
                result.add(length);
                length = 0;
            }
        }

        result.add(length);
        return result.stream().mapToInt(i -> i).toArray();
    }
}