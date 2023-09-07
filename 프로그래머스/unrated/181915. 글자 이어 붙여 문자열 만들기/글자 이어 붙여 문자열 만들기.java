import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            list.add(String.valueOf(my_string.charAt(i)));
        }
        
        for(int i = 0; i < index_list.length; i++){
            answer += list.get(index_list[i]);
        }
        
        return answer;
    }
}