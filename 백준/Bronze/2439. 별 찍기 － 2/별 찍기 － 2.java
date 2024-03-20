import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        for(int i = 1; i <= cnt; i++) { // 2
            for(int j = 1; j <= cnt - i; j++) { // 1 2 3
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++) {    // 0 1
                System.out.print("*");
            }
            System.out.println();
        }

        // 1234  5
        // 123  45
        // 12  345
        //1 2345
        //12345

        //cnt-1
        //cnt-2
        //

    }
}