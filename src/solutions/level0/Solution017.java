package solutions.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181882
 */
class Solution017 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (i >= 50 && i % 2 == 0) {
                list.add(i / 2);
            } else if (i < 50 && i % 2 == 1) {
                list.add(i * 2);
            } else {
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}