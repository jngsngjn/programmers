package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120808
 * 분모 : denominator
 * 분자 : numerator
 */
class Solution092 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] result = new int[2];

        // 분모가 같지 않을 경우, 분모를 같게 만들어 줌
        if (denom1 != denom2) {
            numer1 *= denom2;
            numer2 *= denom1;
            denom1 *= denom2;
        }

        // 분자와 분모를 합침
        int numer = numer1 + numer2;
        int denom = denom1;

        // 분자와 분모의 최대공약수 구하기
        int gcd = gcd(numer, denom);

        // 최대공약수로 분자와 분모를 나누어 기약분수로 변환
        result[0] = numer / gcd;
        result[1] = denom / gcd;
        return result;
    }

    // 유클리드 호제법으로 최대공약수를 구하는 메서드
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}