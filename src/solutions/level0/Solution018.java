package solutions.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181884
 */
class Solution018 {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
            if (sum > n) {
                break;
            }
        }
        return sum;
    }
}