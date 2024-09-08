package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181847
 */
class Solution052 {
    public String solution(String str) {
        if (!str.startsWith("0")) {
            return str;
        }

        char[] chars = str.toCharArray();
        int index = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                index++;
            } else {
                break;
            }
        }

        return str.substring(index + 1);
    }
}