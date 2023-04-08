import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.lang.Math;

public class Main {
    static final int MAX = 1002;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        boolean[] out = new boolean[MAX];
        if (m != 0) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            while (tk.hasMoreTokens()) {
                out[Integer.parseInt(tk.nextToken())] = true;
            }
        }
        int answer = Integer.MAX_VALUE;

        for (int i = 1; i < MAX; i++) {
            if (out[i]) continue;
            for (int j = 1; j < MAX; j++) {
                if (out[j]) continue;
                for (int k = 1; k < MAX; k++) {
                    if (out[k]) continue;
                    answer = Math.min(answer, Math.abs(n - i * j * k));
                }
            }
            if (answer == 0) break;
        }
        bw.write(String.valueOf(answer));
        bw.close();
    }
}