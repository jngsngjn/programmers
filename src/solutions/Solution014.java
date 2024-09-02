package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181909
 */
class Solution014 {
    public String[] solution(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.substring(i));
        }
        Collections.sort(list);
        return list.toArray(new String[0]);
    }
}