package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120816
 */
class Solution101 {
    public int solution(int slice, int n) {
        if (n < slice) {
            return 1;
        }

        if (n % slice == 0) {
            return n / slice;
        }

        return n / slice + 1;
    }
}