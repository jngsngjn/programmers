package solutions.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181897
 */
class Solution034 {
    public int[] solution(int n, int[] slicer, int[] arr) {
        List<Integer> list = new ArrayList<>();

        switch (n) {
            case 1 : {
                for (int i = 0; i <= slicer[1]; i++) {
                    list.add(arr[i]);
                }
                break;
            }
            case 2 : {
                for (int i = slicer[0]; i < arr.length; i++) {
                    list.add(arr[i]);
                }
                break;
            }
            case 3 : {
                for (int i = slicer[0]; i <= slicer[1]; i++) {
                    list.add(arr[i]);
                }
                break;
            }
            default : {
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    list.add(arr[i]);
                }
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}