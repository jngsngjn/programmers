package solutions.level0;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181858
 */
class Solution084 {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[k];
        Arrays.fill(result, -1);

        Set<Integer> set = new HashSet<>();
        int index = 0;

        for (int num : arr) {
            if (index == k) {
                break;
            }
            if (set.add(num)) {  // Set에 추가되면 true 반환, 이미 있으면 false
                result[index++] = num;
            }
        }
        return result;
    }
}