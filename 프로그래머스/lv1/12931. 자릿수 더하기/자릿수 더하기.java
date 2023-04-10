import java.util.*;

public class Solution {
public int solution(int n) {
        int answer = 0;
        String strNum = Integer.toString(n);
        int[] arrNum = new int[strNum.length()];
        for(int i = 0; i < strNum.length(); i++){
            arrNum[i] = strNum.charAt(i) - '0';
            answer += arrNum[i];
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//        System.out.println(strNum);

        return answer;
    }
}