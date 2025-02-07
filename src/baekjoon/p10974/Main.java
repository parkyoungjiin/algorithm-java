package baekjoon.p10974;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Main {
    static int N;
    static int[] arr, ans;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        ans = new int[N];
        visited = new boolean[N];
        // arr = {1,2,3,4, ... , N} 형태로 저장.

        for(int i=1; i<=N; i++){
            arr[i-1] = i;
        }

        backTracking(0);
        System.out.println(sb);
    }

    static void backTracking(int depth) {
        //종료 조건
        if(depth == N){
            //ans 값들을 sb에 넣는다.
            for(int i=0; i<N; i++){
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
            return;
        }//if

        //재귀
        for (int i = 0; i < N; i++) {
            //방문X
            if(!visited[i]){
                visited[i] = true;
                ans[depth] = i + 1;
                backTracking(depth+1);
                visited[i] = false;
            }
        }
    }
}
