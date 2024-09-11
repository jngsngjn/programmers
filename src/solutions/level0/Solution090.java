package solutions.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181832
 */
class Solution090 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n]; // n x n 배열 생성
        int num = 1; // 1부터 채워나갈 숫자
        int x = 0, y = 0; // 시작 위치

        // 이동 방향: 오른쪽(0), 아래(1), 왼쪽(2), 위(3)
        int[] dx = {0, 1, 0, -1}; // x 방향 (행)
        int[] dy = {1, 0, -1, 0}; // y 방향 (열)
        int direction = 0; // 처음엔 오른쪽으로 이동

        while (num <= n * n) {
            answer[x][y] = num++; // 현재 위치에 숫자 채우기

            // 다음 위치 계산
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            // 배열의 범위를 벗어나거나 이미 값이 채워진 경우 방향 전환
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                direction = (direction + 1) % 4; // 방향 전환 (0 -> 1 -> 2 -> 3 -> 다시 0)
                nx = x + dx[direction];
                ny = y + dy[direction];
            }

            // 다음 위치로 이동
            x = nx;
            y = ny;
        }

        return answer;
    }
}