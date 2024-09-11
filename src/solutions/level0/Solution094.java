package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120829
 */
class Solution094 {
    public int solution(int angle) {
        if (0 < angle && angle < 90) {
            return 1;
        }

        if (angle == 90) {
            return 2;
        }

        if (90 < angle && angle < 180) {
            return 3;
        }
        return 4;
    }
}