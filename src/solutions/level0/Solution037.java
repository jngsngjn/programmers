package solutions.level0;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181893
 */
class Solution037 {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length;

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i] + 1;
            } else {
                start += query[i];
            }
        }
        return Arrays.copyOfRange(arr, start, end);
    }
}