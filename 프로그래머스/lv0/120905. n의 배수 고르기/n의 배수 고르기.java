// import java.util.ArrayList;

// class Solution {
//     public int[] solution(int n, int[] numlist) {
//         ArrayList answer = new ArrayList();
//         for(int i=0; i<numlist.length; i++){
//             if(numlist[i]/n == 0){
//                 answer.add(numlist[i]);
//             }
//         }
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public ArrayList solution(int n, int[] numlist) {

        ArrayList<Integer> answer = new ArrayList<>();

        for(int num : numlist){
            if(num % n == 0){
                answer.add(num);
            }
        }

        return answer;
    }
}
