package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181918
 */
class Solution05 {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        int i = 0;
        while (true) {
            if (i >= arr.length) {
                break;
            }

            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            }

            if (stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else {
                stk.remove(stk.size() - 1);
            }
        }

        return stk.stream().mapToInt(a -> a).toArray();
    }
}