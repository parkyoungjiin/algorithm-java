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

        System.out.println(bfs(N));

    }

    static int bfs(int cur){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(cur);
        visited[cur] = true;

        while(!queue.isEmpty()){

            int size = queue.size();

            for(int j = 0; j <size; j++){
                int val = queue.poll();

                if (val == K){
                    return cnt;
                }

                for(int i=0; i<3; i++){
                    int nx;

                    if(dx[i]> 1){
                        nx = dx[i] * val;
                    }else{
                        nx = dx[i] + val;
                    }

                    if(0 <= nx && nx < 100001 && !visited[nx]){
                        visited[nx] = true;
                        queue.offer(nx);
                    }
                }//for i

            }// for j
            cnt++;




        }
        return -1;
    }



}//Main class
