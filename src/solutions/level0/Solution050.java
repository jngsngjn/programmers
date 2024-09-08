package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181840
 */
class Solution050 {
    public int solution(int[] arr, int n) {
        for (int i : arr) {
            if (i == n) {
                return 1;
            }
        }
        return 0;
    }
}