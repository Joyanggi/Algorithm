class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String strNum = Integer.toString(x);
        int[] arrNum = new int[strNum.length()];
        int sum = 0;
        
        for(int i = 0; i < strNum.length(); i++) {
            arrNum[i] = strNum.charAt(i) - '0';
            sum += arrNum[i];
        }
        
        if(x % sum == 0){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}