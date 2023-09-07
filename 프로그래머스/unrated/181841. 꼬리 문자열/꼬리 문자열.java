import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].contains(ex)){
                continue;
            }
            answer += String.valueOf(str_list[i]);
        }
        
        return answer;
    }
}