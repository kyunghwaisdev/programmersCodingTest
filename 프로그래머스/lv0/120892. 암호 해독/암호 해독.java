import java.util.*;

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=0; i<cipher.length(); i++){
            if((i+1)%code == 0){
                answer += String.valueOf(cipher.charAt(i));
            }
          // answer.append(cipher[(code-1)*i]); stringBuffer로 시도했으나...
        }
        return answer;
    }
}
