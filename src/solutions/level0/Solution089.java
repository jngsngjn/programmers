package solutions.level0;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181851
 */
class Solution089 {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map = new HashMap<>(); // rank : index
        for (int i = 0; i < rank.length; i++) {
            map.put(rank[i], i);
        }

        Arrays.sort(rank);
        int[] selected = new int[3];
        int index = 0;
        for (int i = 0; i < rank.length; i++) {
            if (selected[2] != 0) {
                break;
            }

            if (attendance[map.get(i + 1)]) {
                selected[index++] = map.get(i + 1);
            }
        }
        return (10000 * selected[0]) + (100 * selected[1]) + selected[2];
    }
}