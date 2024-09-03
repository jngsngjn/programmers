package solutions;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181892
 */
class Solution031 {
    public int[] solution(int[] arr, int n) {
        int size = arr.length - n + 1;
        int[] answer = new int[size];

        for (int i = 0; i < answer.length; i++, n++) {
            answer[i] = arr[n - 1];
        }

        return answer;
    }
}