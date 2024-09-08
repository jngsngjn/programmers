package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181886
 */
class Solution041 {
    public String[] solution(String[] names) {
        String[] result = new String[names.length / 5 + (names.length % 5 == 0 ? 0 : 1)];

        int index = 0;
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                result[index++] = names[i];
            }
        }
        return result;
    }
}