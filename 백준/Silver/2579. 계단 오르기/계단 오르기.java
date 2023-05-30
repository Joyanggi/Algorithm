import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] stairs = new int[n+1];
        int[] dp = new int[n+1];

        for(int i=1; i<n+1; i++) {
            stairs[i] = scanner.nextInt();
        }
        dp[0] = 0;
        dp[1] = stairs[1];

        if (n >= 2) {
            dp[2] = Math.max(stairs[2], stairs[1] + stairs[2]);
        }

        for(int i=3; i<n+1; i++) {
            dp[i] = Math.max(stairs[i] + stairs[i-1] + dp[i-3],
                    stairs[i] + dp[i-2]) ;
        }
        System.out.println(dp[n]);
    }
}

/*
int stair = {0, 10, 20, 15, 25, 10, 20} // N+1
int dp = {N+1개}
dp[1] = 1번째 계단에 올라갔을 때 얻을 수 있는 최고 점수
dp[N] = N번째 계단 //

규칙 1. 한번에 1계단 or 2계단
규칙 2. 연속된 3계단 금지
규칙 3. 마지막 계단(N번째)는 반드시 밟기

10  20  15  25  10 20
ㅡ  ㅡ   ㅡ  ㅡ  ㅡ  ㅡ
                    ^ 여기를 밟아야 함 (N)
         ^      ^   ^ N 이전에 밟을 수 있는 경우 1 : (N-1) + (N-3)
            ^       ^ N 이전에 밟을 수 있는 경우 2 : (N-2)

case1 : dp[N] = stair[N] + stair[N-1] + dp[N-3]
case2 : dp[N] = stair[N] + dp[N-2]
dp[N] = Math.max(case1, case2)

dp[0] = 0
dp[1] = stair[1]
dp[2] = case1. 두칸 뛰어서 갈 때 : stair[2]
        case2. 한칸씩 두번 뛰어 갈 때 : stair[1] + stair[2]
Math.max(int a, int b) => 둘 중에 더 큰 값 반환
dp[2] = Math.max(stair[2], stair[1] + stair[2])
 */
