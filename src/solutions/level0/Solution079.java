package solutions.level0;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181860
 */
class Solution079 {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                result.addAll(Collections.nCopies(arr[i] * 2, arr[i]));
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    result.remove(result.size() - 1);
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}