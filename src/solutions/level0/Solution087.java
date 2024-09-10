package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181830
 */
class Solution087 {
    public int[][] solution(int[][] arr) {
        int max = Math.max(arr.length, arr[0].length);
        int[][] result = new int[max][max];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }
        }
        return result;
    }
}