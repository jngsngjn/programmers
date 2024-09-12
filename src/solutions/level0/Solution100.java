package solutions.level0;

import java.util.HashMap;
import java.util.Map;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120815
 */
class Solution100 {
    public int solution(int n) {
        int temp = 1;

        // n과 temp가 6으로 나누어 떨어지는 최소값을 찾음
        while ((n * temp) % 6 != 0) {
            temp++;
        }
        return (n * temp) / 6;
    }
}