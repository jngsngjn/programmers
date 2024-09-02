package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181908
 */
class Solution015 {
    public int solution(String str, String suffix) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.substring(i));
        }

        return list.contains(suffix) ? 1 : 0;
    }
}