package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120813
 */
class Solution096 {
    public int[] solution(int n) {
        int length = 0;
        if (n % 2 == 0) {
            length = n / 2;
        } else {
            length = n / 2 + 1;
        }

        int[] result = new int[length];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                result[index++] = i;
            }
        }
        return result;
    }
}