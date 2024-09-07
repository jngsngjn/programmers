package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181896
 */
class Solution032 {
    public int solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}