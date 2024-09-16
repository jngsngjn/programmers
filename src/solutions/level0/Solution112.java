package solutions.level0;

import java.util.Arrays;
import java.util.Collections;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120835
 */
class Solution112 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] sorted = new Integer[emergency.length];

        // emergency 배열 복사
        for (int i = 0; i < emergency.length; i++) {
            sorted[i] = emergency[i];
        }

        // 내림차순으로 정렬
        Arrays.sort(sorted, Collections.reverseOrder());

        // 순위 매기기
        for (int i = 0; i < emergency.length; i++) {
            // sorted 배열에서 emergency[i]가 몇 번째인지 찾아 순위 저장
            for (int j = 0; j < sorted.length; j++) {
                if (emergency[i] == sorted[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }
}