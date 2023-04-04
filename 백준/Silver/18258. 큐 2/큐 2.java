import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Que{
    LinkedList<Integer> Que = new LinkedList<>();
    void push(int x){
        this.Que.add(x);
    }

    int pop(){
        if(Que.size() == 0){
            return -1;
        }else{
            int result = this.Que.get(0);
            this.Que.remove(0);
            return result;
        }
    }

    int size(){
        return this.Que.size();
    }

    int empty(){
        if(this.Que.size() == 0){
            return 1;
        }else{
            return 0;
        }
    }

    int front(){
        if(this.Que.size() == 0) {
            return -1;
        }else{
            return this.Que.get(0);
        }
    }

    int back(){
        if(this.Que.size() == 0) {
            return -1;
        }else{
            return this.Que.get(this.Que.size() - 1);
        }
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Que que = new Que();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine()," ");
            switch(st.nextToken()){
                case "push":
                    que.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(que.pop()).append("\n");
                    break;
                case "size":
                    sb.append(que.size()).append("\n");
                    break;
                case "empty":
                    sb.append(que.empty()).append("\n");
                    break;
                case "front":
                    sb.append(que.front()).append("\n");
                    break;
                case "back":
                    sb.append(que.back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}