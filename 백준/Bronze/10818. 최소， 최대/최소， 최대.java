import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int num;



        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        int min = 0;
        int max = 0;
        
        for(int i = 0; i < N; i++) {
            num = Integer.parseInt(st.nextToken());

            if(i == 0) {
                min = num;
                max = num;
            }

            if(num > max) {
                max = num;
            }

            if(num < min) {
                min = num;
            }

        }
        System.out.println(min + " " + max);
    }
}