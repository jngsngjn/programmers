package solutions;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181889
 */
class Solution030 {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}