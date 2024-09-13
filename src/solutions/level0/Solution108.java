package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120893
 */
class Solution108 {
    public String solution(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
}