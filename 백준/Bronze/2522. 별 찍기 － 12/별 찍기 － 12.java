import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N - i; j++) {
                sb.append(" ");
            }
            for(int k = 1; k <= i; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        for(int a = N-1; a >= 1; a--) {
            for(int c = 1; c <= N - a; c++) {
                sb.append(" ");
            }
            for(int b = 1; b <= a; b++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}