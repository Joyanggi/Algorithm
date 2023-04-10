class Solution {
 public long solution(long n) {
        Double sqrt = Math.sqrt(n);
        if(sqrt != sqrt.intValue()){
            return -1;
        }else {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
    }
}