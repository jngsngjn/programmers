package solutions;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181910
 */
class Solution13 {
    public String solution(String str, int n) {
        int length = str.length();
        return str.substring(length - n);
    }
}