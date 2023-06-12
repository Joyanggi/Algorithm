import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static long[] array = new long[101];
    public static void main(String[] args) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());

        array[0] = 1;
        array[1] = 1;
        array[2] = 1;

//        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < T; i++) {
            int N = in.nextInt();

           sb.append(exp(N-1)).append("\n");
        }
        System.out.println(sb);

    }
    static long exp (int a){
        if (array[a] != 0) {
            return array[a];
        }else{
            return array[a] = exp(a-2) + exp(a-3);
        }
    }
}






/*
   array[n] != 0

   array[n]  = [1, 1, 1, 2, 2, 3, 4, 5, , 0.......]
   if n = 5 ,then:
   array[5] = array[5-2] + array[5-3] = array[3] + array[2]
   array[3] = array[1] + array[0] = 1+ 1 =2
   array[2] = 1

   array[n] = array[n-2] + array[n-3]
*/
