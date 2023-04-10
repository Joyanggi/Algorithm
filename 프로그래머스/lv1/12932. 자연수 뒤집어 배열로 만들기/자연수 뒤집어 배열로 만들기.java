import java.util.Arrays;
import java.util.Collections;
class Solution {
     public int[] solution(long n) {
        String strNum = Long.toString(n);
        int[] arrNum = new int[strNum.length()];
        for(int i = 0, j = strNum.length()-1; i < strNum.length(); i++){
            arrNum[i] = strNum.charAt(j--) - '0';
        }
        
        return arrNum;
    }
}