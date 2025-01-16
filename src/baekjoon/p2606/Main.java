package baekjoon.p2606;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    static boolean[] visited;
    static int [][] nodes;
    static int cnt;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int computers = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        cnt = 0;
        visited = new boolean[computers+1];

        //연결 정보 저장 2차원 배열
        nodes = new int[computers+1][computers+1];

        //인접 행렬 값 넣기
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            nodes[a][b] = nodes[b][a] = 1;

        }


        //1번 감염
        dfs(1);
        System.out.println(cnt-1); //1번은 제외



    }

    static void dfs(int index){
        //방문처리
        visited[index] = true;
        cnt++;
        for(int i = 0 ; i < nodes[index].length; i++){
            if(nodes[index][i] == 1 && !visited[i]){
                dfs(i);

            }
        }


    }
}
