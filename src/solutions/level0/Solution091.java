package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120806
 */
class Solution091 {
    public int solution(int num1, int num2) {
        double d = (double) num1 / num2;
        return (int) (d * 1000);
    }
}