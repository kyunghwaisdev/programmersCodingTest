// class Solution {
//     public int solution(int order) {
//         int answer = 0;
//         String str = order + ""; //자동 형변환
//         for(int i = 0; i < str.length(); i++){
//             // idxnum = str[i]; 아... Stirng 이니까 안되지 !
//             idxnum = str.charAt(i);
//             if(idxnum == '3' || idxnum == '6' || idxnum == '9'){
//                 answer++;
//             }
//         }
//         return answer;
//     }
// }

class Solution {
    public int solution(int order) {
        int answer = 0;
        String strOrder = "" + order;
        for (int i = 0; i < strOrder.length(); i++) {
            int tempChar = strOrder.charAt(i);

            if (tempChar == '3' || tempChar == '6' || tempChar == '9') {
                answer++;
            }
        }
        return answer;
    }
}