package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181872
 */
class Solution071 {
    public String solution(String str, String pat) {
        int index = str.lastIndexOf(pat);
        return str.substring(0, index + pat.length());
    }
}