package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120834
 */
class Solution111 {
    public String solution(int age) {
        char[] chars = String.valueOf(age).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            switch (c) {
                case '0' :
                    sb.append("a");
                    break;
                case '1' :
                    sb.append("b");
                    break;
                case '2':
                    sb.append("c");
                    break;
                case '3' :
                    sb.append("d");
                    break;
                case '4' :
                    sb.append("e");
                    break;
                case '5':
                    sb.append("f");
                    break;
                case '6' :
                    sb.append("g");
                    break;
                case '7' :
                    sb.append("h");
                    break;
                case '8':
                    sb.append("i");
                    break;
                default :
                    sb.append("j");
            }
        }
        return sb.toString();
    }
}