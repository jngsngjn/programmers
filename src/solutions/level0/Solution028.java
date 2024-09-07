package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181898
 */
class Solution028 {
    public int solution(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 && i >= number) {
                return i;
            }
        }
        return -1;
    }
}