import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String strNum = Long.toString(n);
        String Lanswer = "";
        Integer[] intNum = new Integer[strNum.length()];
        for(int i = 0; i < strNum.length(); i++){
            intNum[i] = strNum.charAt(i) - '0';
        }
        Arrays.sort(intNum, Collections.reverseOrder());
        for(int i = 0; i < intNum.length; i++){
            Lanswer += Integer.toString(intNum[i]);    
        }
        answer = Long.parseLong(Lanswer);
        return answer;
    }
}