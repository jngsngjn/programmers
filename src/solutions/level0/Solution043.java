package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181883
 */
class Solution043 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            for (int j = start; j <= end; j++) {
                arr[j]++;
            }
        }
        return arr;
    }
}