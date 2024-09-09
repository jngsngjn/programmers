package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181871
 */
class Solution073 {
    public int solution(String str, String pat) {
        int count = 0, index = 0;
        while ((index = str.indexOf(pat, index)) != -1) {
            count++;
            index++;
        }
        return count;
    }
}