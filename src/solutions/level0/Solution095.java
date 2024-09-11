package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120817
 */
class Solution095 {
    public double solution(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}