package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181922?language=java
 */
class Solution001 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j % (queries[i][2]) == 0) {
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}