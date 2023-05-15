import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] val = new int[N]; //  동전의 가치를 담을 배열

        for (int i = 0; i < N; i++) { //  입력한 가치를 담는 반복문
            val[i] = scanner.nextInt();
            if((i != 0) && (val[i] % val[i-1] != 0)){  //   배수인지 확인하는 조건
                System.exit(1);
            }
        }

        int total = 0;  //  동전의 총 개수

        for (int i = N-1; i >= 0; i--) {
            if (val[i] <= K) {
                total = total + (K / val[i]);
                K = K % val[i];
            }
        }
        System.out.println(total);
    }
}


