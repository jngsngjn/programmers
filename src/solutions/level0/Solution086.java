package solutions.level0;

import java.math.BigInteger;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181846
 */
class Solution086 {
    public String solution(String a, String b) {
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        return num1.add(num2).toString();
    }
}