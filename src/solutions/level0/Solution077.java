package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181829
 */
class Solution077 {
    public int solution(int[][] board, int k) {
        int result = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((i + j) <= k) {
                    result += board[i][j];
                }
            }
        }
        return result;
    }
}