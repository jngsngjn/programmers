package solutions.level0;

import java.util.HashMap;
import java.util.Map;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120812
 */
class Solution099 {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>(); // number : count
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int mode = -1; // 최빈값
        int modeCount = 0;
        boolean isMultiple = false;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();

            if (count > modeCount) {
                modeCount = count;
                mode = entry.getKey();
                isMultiple = false;
            } else if (count == modeCount) {
                isMultiple = true;
            }
        }
        return isMultiple ? -1 : mode;
    }
}