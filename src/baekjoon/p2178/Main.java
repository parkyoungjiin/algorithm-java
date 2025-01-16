package baekjoon.p2178;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Main {
    static int N, M, ans;
    static int [][] arr, visited;

    static int [] dx = {1, -1, 0, 0};
    static int [] dy = {0, 0, 1, -1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()); // 공백으로 구분된 값 -> StringTokenizer로 사용
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new int[N][M];

        for(int i=0; i<N; i++){
            String [] input= br.readLine().split("");
            //String [] -> int []
            int [] numbers = new int[input.length];

            for (int k=0; k<input.length; k++){
                numbers[k] = Integer.parseInt(input[k]);
            }

            arr[i] = numbers;

        }
        visited[0][0] = 1;
        bfs();


        ans = visited[N-1][M-1];
        System.out.println(ans);


    }//main

    static void bfs(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0));

        while(!queue.isEmpty()){
            Node node = queue.poll();
            int x = node.x;
            int y = node.y;

            for(int i=0; i<4; i++){
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                // 범위 확인
                if (0 <= nx && nx < N && 0 <= ny && ny < M){
                    //미로 판별
                    if(arr[nx][ny] == 1 && visited[nx][ny] == 0){
                        queue.add(new Node(nx,ny));
                        visited[nx][ny] = visited[x][y] + 1;
                    }
                }


            }//for
        }//while





    }
}//Main class

class Node{
    int x, y;
    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}