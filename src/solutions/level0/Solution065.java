package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181869
 */
class Solution065 {
    public String[] solution(String str) {
        if (!str.contains(" ")) {
            return new String[]{str};
        }
        return str.split(" ");
    }
}