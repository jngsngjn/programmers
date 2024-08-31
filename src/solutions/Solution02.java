package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181921?language=java
 */
class Solution02 {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r ; i++) {
            String str = String.valueOf(i);
            if (str.matches("[05]+")) {
                list.add(Integer.valueOf(str));
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}