package solutions.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181919
 */
class Solution004 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);

        while (true) {
            if (n == 1) {
                break;
            }

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}