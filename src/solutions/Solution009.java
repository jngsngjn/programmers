package solutions;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181914
 */
class Solution009 {
    public int solution(String number) {
        char[] charArray = number.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c - '0';
        }
        return sum % 9;
    }
}