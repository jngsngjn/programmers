package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181841
 */
class Solution048 {
    public String solution(String[] arr, String ex) {
        StringBuilder result = new StringBuilder();
        for (String str : arr) {
            if (!str.contains(ex)) {
                result.append(str);
            }
        }
        return result.toString();
    }
}