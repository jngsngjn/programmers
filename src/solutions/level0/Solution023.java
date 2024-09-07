package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181903
 */
class Solution023 {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                sb.append(code.charAt(i));
            }
        }
        return sb.toString();
    }
}