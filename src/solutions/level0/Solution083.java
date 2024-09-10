package solutions.level0;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181859
 */
class Solution083 {
    public int[] solution(int[] arr) {
        Stack<Integer> result = new Stack<>();

        for (int num : arr) {
            if (!result.isEmpty() && result.peek() == num) {
                result.pop();
            } else {
                result.push(num);
            }
        }

        if (result.isEmpty()) {
            return new int[]{-1};
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}