package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181910
 */
class Solution013 {
    public String solution(String str, int n) {
        int length = str.length();
        return str.substring(length - n);
    }
}