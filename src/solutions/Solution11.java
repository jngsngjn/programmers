package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181912
 */
class Solution11 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            int parseInt = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (parseInt > k) {
                list.add(parseInt);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}