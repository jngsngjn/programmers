package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181888
 */
class Solution029 {
    public int[] solution(int[] arr, int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % n == 0) {
                result.add(arr[i]);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}