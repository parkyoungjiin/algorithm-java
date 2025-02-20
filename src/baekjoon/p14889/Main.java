package baekjoon.p14889;
import java.util.*;
import java.io.*;

public class Main{
    static int N;
    static boolean[] visited;
    static int [][] arr;
    static int start_cnt, link_cnt;
    static int min_value = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N]; //0번지 포함
        visited = new boolean[N];

        //입력값(능력치)
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }

        }

        combi(0,0);
        System.out.println(min_value);


    }

    static void combi(int index, int depth) {
        //종료조건 & 계산
        if (depth == N / 2) {
            getResult();
            return;
        }
        for (int i = index; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combi(i+1, depth+1);
                visited[i] = false;
            }
        }
    }//combi

    static void getResult() {
        int start_val = 0;
        int link_val = 0;
        int result = 0;

        for (int i = 0; i < N-1; i++) {
            for(int j=i+1; j<N; j++){
                //true
                if (visited[i] == true && visited[j] == true) {
                    start_val += arr[i][j];
                    start_val += arr[j][i];
                }

                //false
                if (visited[i] == false && visited[j] == false) {
                    link_val += arr[i][j];
                    link_val += arr[j][i];
                }
            }

        }

        result = Math.abs(start_val - link_val);

        if (result == 0) {
            System.out.println(result);
            System.exit(0);
        }

        min_value = Math.min(min_value, result);

    }

}