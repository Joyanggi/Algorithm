import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int start, int end_num) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = start; i >= end_num; i--){
            list.add(i);
        }
        
        Integer[] intermediateArray = list.toArray(new Integer[0]);
        
        int[] result = new int[intermediateArray.length];
        
        for (int i = 0; i < intermediateArray.length; i++) {
            result[i] = intermediateArray[i];
        }
        
        return result;
    }
}