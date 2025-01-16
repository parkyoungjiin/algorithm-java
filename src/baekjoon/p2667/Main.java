package baekjoon.p2667;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int n, cnt;
    static int[][] arr;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];

        for(int i=0; i<n; i++){
            String[] input = br.readLine().split("");

            int[] int_input = new int[input.length];

            for(int j=0; j<input.length; j++){
                int_input[j] = Integer.parseInt(input[j]);
            }

            arr[i] = int_input;

        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (arr[i][j] == 1){
                    cnt=1; //단지 내 집 개수
                    bfs(i, j);
                    ans.add(cnt);
                }
            }
        }

        System.out.println(ans.size());

        Collections.sort(ans);

        for(int i=0; i<ans.size();i++){
            System.out.println(ans.get(i));
        }

    }

    static void dfs(int x, int y){
        arr[x][y] = 0; // 방문처리

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            //범위 확인
            if(0<=nx && nx <n && 0<=ny && ny<n){
                if(arr[nx][ny] == 1){
                    cnt+=1;
                    dfs(nx, ny);
                }
            }

        }
    }

    static void bfs(int x, int y){
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x,y));
        arr[x][y] = 0; //방문처리

        while(!queue.isEmpty()){
            Node node = queue.poll();
            int currentX =node.x;
            int currentY =node.y;

            for(int i=0; i<4; i++){
                int nx = dx[i] + currentX;
                int ny = dy[i] + currentY;

                if(0<=nx && nx <n && 0<=ny && ny <n){
                    if(arr[nx][ny] == 1){
                        arr[nx][ny] = 0;
                        queue.add(new Node(nx, ny));
                        cnt++;
                    }
                }
            }//for 4
        }//while

    }

    static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
