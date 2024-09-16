package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120838
 */
class Solution113 {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();

        String[] split = letter.split(" ");
        for (String s : split) {
            switch (s) {
                case ".-" -> sb.append("a");
                case "-..." -> sb.append("b");
                case "-.-." -> sb.append("c");
                case "-.." -> sb.append("d");
                case "." -> sb.append("e");
                case "..-." -> sb.append("f");
                case "--." -> sb.append("g");
                case "...." -> sb.append("h");
                case ".." -> sb.append("i");
                case ".---" -> sb.append("j");
                case "-.-" -> sb.append("k");
                case ".-.." -> sb.append("l");
                case "--" -> sb.append("m");
                case "-." -> sb.append("n");
                case "---" -> sb.append("o");
                case ".--." -> sb.append("p");
                case "--.-" -> sb.append("q");
                case ".-." -> sb.append("r");
                case "..." -> sb.append("s");
                case "-" -> sb.append("t");
                case "..-" -> sb.append("u");
                case "...-" -> sb.append("v");
                case ".--" -> sb.append("w");
                case "-..-" -> sb.append("x");
                case "-.--" -> sb.append("y");
                case "--.." -> sb.append("z");
            }
        }
        return sb.toString();
    }
}