import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] point = new int[N][2];

        for (int i = 0; i < N; i++) {
            point[i][0] = scanner.nextInt();
            point[i][1] = scanner.nextInt();
        }

        Arrays.sort(point, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {       //y 값이 동일할 시
                    return o1[0] - o2[0];   //x 값이 오름차순으로 정렬
                }else {
                    return o1[1] - o2[1];
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < 2; j++){
                sb.append(point[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}



/*
    [x] [y]
    0   4
    1   -1
    1   1
    2   2
    3   3



*/

/*
    for(i){

        for(j){

        }
    }
 */