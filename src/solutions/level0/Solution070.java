package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181833
 */
class Solution070 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < answer.length; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}