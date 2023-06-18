import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int result = factorial(N) / (factorial(K)*factorial(N-K));

        System.out.println(result);
    }
    public static int factorial(int x) {
        int val = 1;
        for(int i = 1; i <= x; i++){
            val = val * i;
        }
        return val;
    }


}

