import javax.print.attribute.standard.MediaSize;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  //  사람의 수 N
//        int P = scanner.nextInt();  //  걸리는 시간 P

        int PArray[] = new int[N];
        int total = 0;
        int totalArray[] = new int[N];

        for(int i = 0; i < N; i++){
            PArray[i] = scanner.nextInt();
        }
        Arrays.sort(PArray);
        for(int i = 0; i < N; i++){
            if(i != 0) {
                //total += PArray[i] + PArray[i - 1];
                totalArray[i] = PArray[i] + totalArray[i-1];
                /*
                i = 0, PArray[1, 2, 3, 3, 4], totalArray[i] = 1
                i = 1, totlaArray[i] =
                 */
            }else{
                //total += PArray[i];
                totalArray[i] = PArray[i];
            }
        }
        for(int i = 0; i < N; i++){
            total += totalArray[i];
        }
        System.out.println(total);

    }
}

/*
[P2, P5, P1, P4, P3] 순서대로 줄을 서면 최소값
 ㄴ [1, 2, 3, 3, 4] => 이 자체를 더하면 답이 x
 ㄴ 새로운 배열 = [1, 1+2, 1+2+3, 1+2+3+3, 1+2+3+3+4]
     ㄴ 최소값

풀이 순서
1. 시간을 배열에 저장
2. 오름차순으로 정렬
3. 각 사람 별 누적 시간 계산
4. 전체 누적 시간 계산
 */
