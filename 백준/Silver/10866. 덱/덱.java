import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Deque{
    LinkedList<Integer> deque = new LinkedList<>();
    void push_front(int x){
        this.deque.addFirst(x);
    }
    void push_back(int x){
        this.deque.addLast(x);
    }

    int pop_front(){
        if(!this.deque.isEmpty()) {
            int front = this.deque.getFirst();
            this.deque.removeFirst();
            return front;
        }else{
            return -1;
        }
    }

    int pop_back(){
        if(!this.deque.isEmpty()) {
            int back = this.deque.getLast();
            this.deque.removeLast();
            return back;
        }else{
            return -1;
        }
    }

    int size(){
        return this.deque.size();
    }

    int empty(){
        if(!this.deque.isEmpty()){
            return 0;
        }else{
            return 1;
        }
    }

    int front(){
        if(!this.deque.isEmpty()) {
            return this.deque.getFirst();
        }else{
            return -1;
        }
    }

    int back(){
        if(!this.deque.isEmpty()) {
            return this.deque.getLast();
        }else{
            return -1;
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Deque deque = new Deque();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()){
                case "push_front":
                    deque.push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(deque.pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(deque.pop_back()).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.empty()).append("\n");
                    break;
                case "front":
                    sb.append(deque.front()).append("\n");
                    break;
                case "back":
                    sb.append(deque.back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}