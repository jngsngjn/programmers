package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181831
 */
class Solution076 {
    public int solution(int[][] arr) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == arr[j][i]) {
                    result = true;
                } else {
                    result = false;
                    return 0;
                }
            }
        }
        return result ? 1 : 0;
    }
}