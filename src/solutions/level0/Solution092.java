package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120808
 */
class Solution092 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] result = new int[2];

        if (denom1 != denom2) {
            numer1 *= denom2;
            denom1 *= denom2;

            numer2 *= denom1;
            denom2 *= denom1;
        }

        int numer = numer1 + numer2;
        int denom = denom1 + denom2;

        if (denom % numer == 0) {

        }

        return result;
    }
}