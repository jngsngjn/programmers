package solutions.level0;

import java.util.HashSet;
import java.util.Set;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181844
 */
class Solution033 {
    public int[] solution(int[] arr, int[] deleteArr) {
        Set<Integer> deleteSet = new HashSet<>();
        for (int num : deleteArr) {
            deleteSet.add(num);
        }

        int[] temp = new int[arr.length];
        int index = 0;

        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                temp[index++] = num;
            }
        }

        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);

        return result;
    }
}