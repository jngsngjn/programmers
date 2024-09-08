package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181878
 */
class Solution046 {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}