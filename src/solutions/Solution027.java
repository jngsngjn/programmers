package solutions;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181899
 */
class Solution027 {
    public int[] solution(int start, int end) {
        int size = start - end + 1;
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = start;
            start--;
        }

        return result;
    }
}