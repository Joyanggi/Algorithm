class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int multi = 1;
        int add = 0;
        
        for(int i = 0; i < num_list.length; i++){
            multi = multi * num_list[i];
            add += num_list[i];
        }
        
        if(multi < add*add){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}