package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181891
 */
class Solution038 {
    public int[] solution(int[] arr, int n) {
        int[] result = new int[arr.length];

        // n부터 끝까지 복사
        for (int i = n; i < arr.length; i++) {
            result[i - n] = arr[i];
        }

        // 0부터 n까지 복사
        for (int i = 0; i < n; i++) {
            result[arr.length - n + i] = arr[i];
        }

        return result;
    }
}