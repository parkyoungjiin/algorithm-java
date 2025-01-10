package baekjoon.p1697;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int N, K, cnt;
    static int[] dx = {1, -1, 2};
    static boolean[] visited = new boolean[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" "); // 공백 기준
        N = Integer.parseInt(str[0]);
        K = Integer.parseInt(str[1]);

        bfs(N);
    }

    public static int bfs(int cur){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(cur); // 현 위치 queue에 넣음.
        visited[cur] = true; //현 위치 방문 처리

        while(!queue.isEmpty()){
            //size 만큼 반복을 돌면서 횟수 처리를 위함.
            int size = queue.size();

            for (int i = 0 ; i < size ; i++){
                int currentN = queue.poll();

                if (currentN == K){
                    System.out.println(cnt);
                    return cnt;
                }

                for (int j = 0 ; j < 3; j++){
                    int next;
                    if (j < 2){
                        next = currentN + dx[j];
                    }else{
                        next = currentN * dx[j];
                    }

                    // 예외 처리 ( 0 < next < 100001이 아닌 경우, 방문 처리 된 경우)
                    if (next < 0 || next > 100000 || visited[next]){
                        continue;
                    }

                    // 방문처리
                    visited[next] = true;

                    // 큐에 삽입.
                    queue.offer(next);

                } // j for
            }// i for

            cnt++;

        } //while for
        return -1;
    }//bfs

}//Main class
