package solutions.level0;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181895
 */
class Solution035 {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> result = new ArrayList<>();

        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            result.add(arr[i]);
        }

        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            result.add(arr[i]);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}