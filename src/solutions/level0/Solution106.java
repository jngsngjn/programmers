package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120824
 */
class Solution106 {
    public int[] solution(int[] arr) {
        int even = 0;
        int odd = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[]{even, odd};
    }
}