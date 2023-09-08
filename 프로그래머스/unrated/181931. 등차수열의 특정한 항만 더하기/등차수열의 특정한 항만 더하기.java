class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int[] array = new int[included.length];
        
        array[0] = a;
        int idx = 1;
        
        for(int i = 1; i < included.length; i++){
            array[idx] = array[idx - 1] + d;
            idx++;
        }
        
        for(int i = 0; i < included.length; i++){
            if(included[i] == true){
                answer += array[i];
            }
        }
        
        return answer;
    }
}