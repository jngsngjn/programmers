package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181880
 */
class Solution045 {
    public int solution(int[] arr) {
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            while (true) {
                if (arr[i] == 1) {
                    break;
                }

                if (arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else {
                    arr[i]--;
                    arr[i] /= 2;
                }
                answer++;
            }
        }

        return answer;
    }
}