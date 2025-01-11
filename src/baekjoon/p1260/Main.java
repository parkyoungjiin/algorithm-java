package baekjoon.p1260;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.*;


public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N, M, V;
    static boolean [] visited = new boolean[1001];
    static int [][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input = br.readLine().split(" ");


        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        V = Integer.parseInt(input[2]); //시작점

        arr = new int[N+1][N+1];

        //간선 정보 저장
        for(int i = 0; i < M; i++){
            String[] nodes = br.readLine().split(" ");
            int a = Integer.parseInt(nodes[0]);
            int b = Integer.parseInt(nodes[1]);

            arr[a][b] = arr[b][a] = 1; //양방향 관계 저장.

        }

        dfs(V);
        System.out.println(sb);
        //초기화
        sb = new StringBuilder();
        visited = new boolean[1001];
        //bfs
        bfs(V);
        System.out.println(sb);


    }//main


    static void dfs(int cur){
        //방문 처리
        visited[cur] = true;
        sb.append(cur + " ");

        for(int i=0; i<=N; i++){
            //연결 && 미방문 시 재귀
            if(arr[cur][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }

    static void bfs(int cur){
        sb.append(cur +" ");
        visited[cur] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(cur);

        while(!queue.isEmpty()) {
            // 큐에서 제거
            int first = queue.poll();

            for (int i = 0; i <= N; i++) {
                // 뽑은 값과 연결되어 있고, 방문하지 않은 경우 큐에 넣어주고 sb에 추가(방문처리)
                if (arr[first][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    sb.append(i + " ");
                }
            }
        }

    }

}
