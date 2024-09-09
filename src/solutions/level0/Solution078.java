package solutions.level0;

import java.time.LocalDate;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181838
 */
class Solution078 {
    public int solution(int[] arr1, int[] arr2) {
        LocalDate date1 = LocalDate.of(arr1[0], arr1[1], arr1[2]);
        LocalDate date2 = LocalDate.of(arr2[0], arr2[1], arr2[2]);
        return date1.isBefore(date2) ? 1 : 0;
    }
}