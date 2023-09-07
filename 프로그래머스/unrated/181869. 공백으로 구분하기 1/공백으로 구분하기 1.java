import java.util.StringTokenizer;

class Solution {
    public String[] solution(String my_string) {
        int n = 0;
        StringTokenizer st = new StringTokenizer(my_string, " ");
        
        String[] answer = new String[st.countTokens()];
        
        while(true){
            answer[n] = st.nextToken();
            n++;
            if(st.countTokens() == 0){
                break;
            }
        }
        
        return answer;
    }
}