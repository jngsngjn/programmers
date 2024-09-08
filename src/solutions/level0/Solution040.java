package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181887
 */
class Solution040 {
    public int solution(int[] arr) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        return Math.max(oddSum, evenSum);
    }
}