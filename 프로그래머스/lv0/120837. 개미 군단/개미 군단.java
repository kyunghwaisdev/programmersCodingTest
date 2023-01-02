class Solution {
    public int solution(int hp) {
        int answer = 0;
        answer += hp / 5;  //장군개미
        answer += (hp % 5) / 3; //병정개미
        answer += (hp % 5) % 3; //일개미
        return answer;
    }
}