package solutions;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181902
 */
class Solution024 {
    public int[] solution(String str) {
        char[] chars = str.toCharArray();
        int[] result = new int[52];

        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                int index = c - 'A';
                result[index] = result[index] + 1;
            }

            if (Character.isLowerCase(c)) {
                int index = c - 'a' + 26;
                result[index] = result[index] + 1;
            }
        }
        return result;
    }
}