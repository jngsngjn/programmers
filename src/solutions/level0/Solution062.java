package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181856
 */
class Solution062 {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        }

        int sum1 = 0, sum2 = 0;
        for (int i : arr1) {
            sum1 += i;
        }
        for (int i : arr2) {
            sum2 += i;
        }

        if (sum1 != sum2) {
            return sum1 > sum2 ? 1 : -1;
        }
        return 0;
    }
}