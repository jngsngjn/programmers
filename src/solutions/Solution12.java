package solutions;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181911
 */
class Solution12 {
    public String solution(String[] strArr, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1];

            String substring = strArr[i].substring(start, end + 1);
            sb.append(substring);
        }
        return sb.toString();
    }
}