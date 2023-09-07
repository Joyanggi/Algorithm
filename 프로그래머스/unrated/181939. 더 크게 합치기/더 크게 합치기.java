class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String stringA = Integer.toString(a);
        String stringB = Integer.toString(b);
        
        int result1 = Integer.parseInt(stringA + stringB);
        int result2 = Integer.parseInt(stringB + stringA);
        
        if(result1 > result2){
            answer = result1;
        }else if(result2 > result1){
            answer = result2;
        }else{
            answer = result1;
        }
        
        return answer;
    }
}