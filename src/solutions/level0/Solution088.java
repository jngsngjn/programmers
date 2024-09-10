package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181836
 */
class Solution088 {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        int index = 0;
        for (String row : picture) {
            StringBuilder sb = new StringBuilder();
            for (char ch : row.toCharArray()) {
                sb.append(String.valueOf(ch).repeat(k));
            }
            String expandedRow = sb.toString();
            for (int i = 0; i < k; i++) {
                answer[index++] = expandedRow;
            }
        }
        return answer;
    }
}