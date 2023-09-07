class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        
        int a = 1;
        
        for(int i = 0; i < n; i++){
            answer[i] = k * a;
            a++;
            
            if(k * a > n){
                break;
            }
            
            
        }
        
        return answer;
    }
}