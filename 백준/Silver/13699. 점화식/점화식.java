import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long[] dp = new long[36];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i <= 35; i++){
           for(int j = 0; j < i; j++){
               dp[i] += (dp[j] * dp[i - j - 1]);
           }
        }

        System.out.println(dp[n]);
    }
//    static int function(int n) {
//        int answer = 0;
//        if (n == 0) {
//            return dp[0];
//        } else if (n == 1) {
//            return dp[1];
//        } else if (dp[n] != 0) {
//            return dp[n];
//        } else {
//            answer += dp[n] = function(n) * function(n - 1);
//        }
//        return answer;
//    }
}