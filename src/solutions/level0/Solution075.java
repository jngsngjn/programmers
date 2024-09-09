package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181865
 */
class Solution075 {
    public int solution(String binomial) {
        String[] parts = binomial.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);

        switch (parts[1]) {
            case "+" :
                return a + b;
            case "-" :
                return a - b;
            default :
                return a * b;
        }
    }
}