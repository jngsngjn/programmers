package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181879
 */
class Solution016 {
    public int solution(int[] intArr) {
        int result = 0;
        if (intArr.length >= 11) {
            for (int i : intArr) {
                result += i;
            }
            return result;
        }

        result = 1;
        for (int i : intArr) {
            result *= i;
        }
        return result;
    }
}