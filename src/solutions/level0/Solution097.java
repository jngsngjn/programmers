package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120814
 */
class Solution097 {
    public int solution(int n) {
        if (n < 7) {
            return 1;
        }
        if (n % 7 == 0) {
            return n / 7;
        }
        return n / 7 + 1;
    }
}