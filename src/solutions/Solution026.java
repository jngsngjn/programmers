package solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181900
 */
class Solution026 {
    public String solution(String str, int[] arr) {
        Set<Integer> removeSet = new HashSet<>();
        for (int index : arr) {
            removeSet.add(index);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!removeSet.contains(i)) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}