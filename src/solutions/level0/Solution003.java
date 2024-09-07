package solutions.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181920
 */
class Solution003 {
    public int[] solution(int start_num, int end_num) {
        List<Integer> list = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            list.add(i);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}