class Solution {
   boolean solution(String s) {
        boolean answer = true;
        int PCnt = 0;
        int YCnt = 0;
        String[] array = s.toLowerCase().split("");
        for (int i = 0; i < array.length; i++) { 
            if ("p".equals(array[i])) {
                PCnt++;
            } else if ("y".equals(array[i])) {
                YCnt++;
            }
        }
        if(PCnt == YCnt){
            answer = true;
        }else{
            answer = false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.


        return answer;
    }
}