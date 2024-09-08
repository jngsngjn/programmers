package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181854
 */
class Solution053 {
    public int[] solution(int[] arr, int n) {
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    arr[i] += n;
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    arr[i] += n;
                }
            }
        }
        return arr;
    }
}