import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList <Integer>answer = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if (arr[i]%divisor==0){
                answer.add(arr.[i]);
            }
            }
        answer.sort(Comparator.naturalOrder());
        if(answer.size() ==0){
            answer.add(-1);
        }
        return answer;
    }
}