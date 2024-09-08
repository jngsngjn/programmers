package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181834
 */
class Solution060 {
    public String solution(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 'l') {
                arr[i] = 'l';
            }
        }
        return new String(arr);
    }
}