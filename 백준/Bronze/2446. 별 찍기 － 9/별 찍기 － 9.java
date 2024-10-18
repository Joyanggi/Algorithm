import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {   //1, 2, 3, 4, 5
            for(int j = 0; j < i; j++) {    //0, 1[0, 1], 2, [0, 1, 3]
                sb.append(" ");
            }

            for(int k = 0; k < (2 * N - 1) - (2 * i); k++) {   //9, 7, 5, 3, 1 -> N(5)
                sb.append("*");
            }
            sb.append("\n");
        }

        for(int a = 0; a < N - 1; a++) {
            for(int b = 1; b < (N - 1) - a; b++) {
                sb.append(" ");
            }

            for(int c = 0; c < 3 + (2 * a); c++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}