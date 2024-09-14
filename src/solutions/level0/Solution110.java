package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120833
 */
class Solution110 {
    public int[] solution(int[] arr, int num1, int num2) {
        int[] result = new int[num2 - num1 + 1];
        int index = 0;
        for (int i = num1; i <= num2; i++) {
            result[index++] = arr[i];
        }
        return result;
    }
}