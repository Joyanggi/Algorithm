class Solution {
    public int[] solution(int[] arr, int[][] queries) {
         int E;
        for(int i = 0; i < queries.length; i++) { // 0, 1, 1
            E = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = E;
        }
        return arr;
    }
}