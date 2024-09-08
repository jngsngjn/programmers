package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181873
 */
class Solution067 {
    public String solution(String str, String alp) {
        if (!str.contains(alp)) {
            return str;
        }
        return str.replaceAll(alp, alp.toUpperCase());
    }
}