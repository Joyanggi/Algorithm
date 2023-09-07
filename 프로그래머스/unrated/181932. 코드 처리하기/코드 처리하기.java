import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String code) {
        String answer = "";
        
        int mode = 0;

        List<String> array = new ArrayList<>();

        for(int i= 0; i < code.length(); i++){
            array.add(String.valueOf(code.charAt(i)));
        }

        for(int i = 0; i < array.size(); i++){
            if(mode == 0){
                if(!(array.get(i).equals("1")) && i % 2 == 0){
                    answer += array.get(i);
                }else if(array.get(i).equals("1")){
                    mode = 1;
                }
            }else if(mode == 1){
                if(!(array.get(i).equals("1")) && i % 2 != 0){
                    answer += array.get(i);
                }else if(array.get(i).equals("1")){
                    mode = 0;
                }
            }
        }
        if(answer.equals("")){
            answer = "EMPTY";
        }

        return answer;
    }
}