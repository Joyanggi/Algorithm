import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        String[] minusArray = expression.split("-");
        for(int i = 0; i < minusArray.length; i++){
            int addResult = 0;
            String[] addArray = minusArray[i].split("\\+");
            for(int j = 0; j < addArray.length; j++){
                addResult = addResult + Integer.parseInt(addArray[j]);
            }
            if(i == 0){
                total = addResult;
            }else{
                total = total - addResult;
            }
        }
        System.out.println(total);
    }
}


