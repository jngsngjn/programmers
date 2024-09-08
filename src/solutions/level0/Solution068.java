package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181875
 */
class Solution068 {
    public String[] solution(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i].toLowerCase();
            } else {
                arr[i] = arr[i].toUpperCase();
            }
        }
        return arr;
    }
}