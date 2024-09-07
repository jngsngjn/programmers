package solutions.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181905
 */
class Solution021 {
    public String solution(String str, int start, int end) {
        StringBuilder sb = new StringBuilder(str);
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
        return sb.toString();
    }
}