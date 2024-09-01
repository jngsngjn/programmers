package solutions;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181915
 */
class Solution08 {
    public String solution(String str, int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(str.charAt(arr[i]));
        }
        return sb.toString();
    }
}