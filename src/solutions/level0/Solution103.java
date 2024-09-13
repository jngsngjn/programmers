package solutions.level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120821
 */
class Solution103 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        Collections.reverse(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}