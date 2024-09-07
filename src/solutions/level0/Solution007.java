package solutions.level0;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181916
 */
class Solution007 {
    public int solution(int a, int b, int c, int d) {

        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);

        if (set.size() == 1) {
            // 네 숫자가 모두 같은 경우
            return 1111 * a;
        }

        if (set.size() == 4) {
            // 네 숫자가 모두 다른 경우
            return Collections.min(set);
        }

        List<Integer> list = Arrays.asList(a, b, c, d);
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        if (set.size() == 2) {
            int p = 0, q = 0;
            for (int key : frequencyMap.keySet()) {
                if (frequencyMap.get(key) == 3) {
                    p = key;
                    q = frequencyMap.keySet().stream().filter(k -> k != key).findFirst().get();
                    return (10 * p + q) * (10 * p + q);
                }
                if (frequencyMap.get(key) == 2) {
                    List<Integer> keys = new ArrayList<>(frequencyMap.keySet());
                    p = keys.get(0);
                    q = keys.get(1);
                    return (p + q) * Math.abs(p - q);
                }
            }
        }

        if (set.size() == 3) {
            int p = 0, q = 0, r = 0;
            for (int key : frequencyMap.keySet()) {
                if (frequencyMap.get(key) == 2) {
                    p = key;
                } else {
                    if (q == 0) {
                        q = key;
                    } else {
                        r = key;
                    }
                }
            }
            return q * r;
        }

        return 0;
    }
}