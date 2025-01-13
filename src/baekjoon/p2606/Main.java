package baekjoon.p2606;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int computers = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        boolean[] visited = new boolean[computers+1];

        int[][] nodes = new int[computers+1][computers+1];
        //연결 정보
        for (int i = 0 ; i < n; i++){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            nodes[a][b] = nodes[b][a] = 1;
        }

        //1번 감염 시
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        visited[1] = true;
        int cnt = 0;

        while(!queue.isEmpty()){
            int val = queue.poll();

            for(int i = 1; i<=computers; i++){
                if(nodes[val][i] == 1 && !visited[i]){
                    visited[i] = true;
                    queue.offer(i);
                    cnt++;
                }
            }

        }

        System.out.println(cnt);




    }
}
