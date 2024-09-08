package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181849
 */
class Solution055 {
    public int solution(String str) {
        int result = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                result += c - '0';
            }
        }
        return result;
    }
}