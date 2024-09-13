package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120851
 */
class Solution107 {
    public int solution(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            try {
                sum += Integer.parseInt(c + "");
            } catch (NumberFormatException e) {}
        }
        return sum;
    }
}