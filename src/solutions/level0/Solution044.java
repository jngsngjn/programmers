package solutions.level0;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181881
 */
class Solution044 {
    public int solution(int[] arr) {
        int count = 0;

        while (true) {
            int[] compareArr = Arrays.copyOf(arr, arr.length);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) {
                    arr[i] = arr[i] / 2;
                }
                else if (arr[i] % 2 != 0 && arr[i] < 50) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            if (Arrays.equals(arr, compareArr)) {
                break;
            }
            count++;
        }
        return count;
    }
}