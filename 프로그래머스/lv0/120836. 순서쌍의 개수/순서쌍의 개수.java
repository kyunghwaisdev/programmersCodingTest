//소인수 +1 이면 되겠다..
 import java.util.ArrayList;

class Solution {
        public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer++;
            }
        }
        return answer;
    }
}