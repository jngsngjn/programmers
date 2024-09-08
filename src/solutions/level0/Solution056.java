package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181839
 */
class Solution056 {
    public int solution(int a, int b) {
        if (a % 2 != 0 && b % 2 != 0) {
            return a * a + b * b;
        }

        if (a % 2 == 0 && b % 2 == 0) {
            return Math.abs(a - b);
        }

        return 2 * (a + b);
    }
}