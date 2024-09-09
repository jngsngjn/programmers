package solutions.level0;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181857
 */
class Solution080 {
    public int[] solution(int[] arr) {
        int length = arr.length;

        // 이미 배열 길이가 2의 정수 거듭제곱이면 그대로 반환
        if ((length & (length - 1)) == 0) {
            return arr;
        }

        // 배열 길이를 2의 정수 거듭제곱으로 맞추기
        int newLength = 1;
        while (newLength < length) {
            newLength *= 2;
        }

        // 새로운 배열 생성하고 기존 배열 값 복사
        int[] result = new int[newLength];
        System.arraycopy(arr, 0, result, 0, length);

        return result;
    }
}