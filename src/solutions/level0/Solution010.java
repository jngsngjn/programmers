package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181913
 */
class Solution010 {
    public String solution(String str, int[][] queries) {
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            reverse(start, end, sb);
        }

        return sb.toString();
    }

    public void reverse(int start, int end, StringBuilder sequence) {
        while (start < end) {
            char temp = sequence.charAt(start);
            sequence.setCharAt(start, sequence.charAt(end));
            sequence.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}