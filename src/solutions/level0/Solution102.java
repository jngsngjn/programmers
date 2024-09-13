package solutions.level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120837
 */
class Solution102 {
    public int solution(int hp) {
        int ant = 0;

        // 5로 나눈 몫을 추가하고 나머지를 hp에 할당
        ant += hp / 5;
        hp %= 5;

        // 3으로 나눈 몫을 추가하고 나머지를 hp에 할당
        ant += hp / 3;
        hp %= 3;

        // 남은 hp는 모두 1로 처리
        ant += hp;

        return ant;
    }
}