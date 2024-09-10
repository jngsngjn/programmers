package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181837
 */
class Solution085 {
    public int solution(String[] order) {
        int total = 0;
        for (String menu : order) {
            if (menu.equals("anything") || menu.contains("americano")) {
                total += 4500;
            } else {
                total += 5000;
            }
        }
        return total;
    }
}