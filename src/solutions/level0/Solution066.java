package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181874
 */
class Solution066 {
    public String solution(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                arr[i] = 'A';
            }

            if (arr[i] != 'A' && Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        return new String(arr);
    }
}