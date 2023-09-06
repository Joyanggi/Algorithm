import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str = br.readLine();

        int cnt = str.length() / 10;
        int index = 0;

        for(int i = 0; i < cnt; i++){
            System.out.println(str.substring(index, index + 10));
            index += 10;
        }
        cnt = str.length() % 10;
        System.out.println(str.substring(str.length() - cnt));
    }
}