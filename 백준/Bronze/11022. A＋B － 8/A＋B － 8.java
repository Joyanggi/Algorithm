import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String str;

        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append("Case #").append(i).append(": ").append(A).append(" + ").append(B).append(" = ").append((A+B)).append('\n');
        }
        System.out.println(sb);
    }
}