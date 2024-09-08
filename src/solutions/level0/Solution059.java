package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181864
 */
class Solution059 {
    public int solution(String str, String pat) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (chars[i] == 'A') ? 'B' : 'A';
        }
        return new String(chars).contains(pat) ? 1 : 0;
    }
}