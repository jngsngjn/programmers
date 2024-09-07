package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181890
 */
class Solution039 {
    public String[] solution(String[] arr) {
        int index = -1;
        boolean left = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("l") || arr[i].equals("r")) {
                index = i;
                if (arr[i].equals("r")) {
                    left = false;
                }
                break;
            }
        }

        if (index < 0) {
            return new String[]{};
        }

        if (left) {
            String[] result = new String[index];
            for (int i = 0; i < index; i++) {
                result[i] = arr[i];
            }
            return result;
        } else {
            String[] result = new String[arr.length - index - 1];
            for (int i = index + 1; i < arr.length; i++) {
                result[i - index - 1] = arr[i];
            }
            return result;
        }
    }
}