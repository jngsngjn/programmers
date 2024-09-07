package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181904
 */
class Solution022 {
    public String solution(String str, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += m) {
            sb.append(str.charAt(i + c - 1));
        }
        return sb.toString();
    }
}