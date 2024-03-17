import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = Integer.parseInt(sc.nextLine());
        String num = sc.nextLine();

        String[] numList = num.split(" ");
        int[] parseStringList = new int[numList.length];

        for(int i = 0; i < numList.length; i++) {
            parseStringList[i] = Integer.parseInt(numList[i]);
        }

        int minNum = parseStringList[0];
        int maxNum = parseStringList[0];

        for(int i = 0; i < cnt; i++) {
            if(parseStringList[i] > maxNum) {
                maxNum = parseStringList[i];
            }
            if(parseStringList[i] < minNum) {
                minNum = parseStringList[i];
            }
        }

        System.out.println(minNum + " " + maxNum);
    }
}