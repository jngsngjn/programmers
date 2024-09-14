package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120830
 */
class Solution109 {
    public int solution(int n, int k) {
        int service = n / 10;
        return (n * 12000) + (k * 2000) - (service * 2000);
    }
}