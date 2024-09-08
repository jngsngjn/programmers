package solutions.level0;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181852
 */
class Solution054 {
    public int[] solution(int[] arr) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, 5, arr.length);
    }
}