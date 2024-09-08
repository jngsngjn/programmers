package solutions.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181861
 */
class Solution057 {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= arr[i]; j++) {
                result.add(arr[i]);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}