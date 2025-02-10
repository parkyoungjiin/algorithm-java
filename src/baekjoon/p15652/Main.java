package baekjoon.p15652;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [] arr;
//    static boolean [] visited;
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        backTracking(0, 0);
        System.out.println(sb);

    }//main

    static void backTracking(int at, int depth){
        if(depth == M){

            for(int val : arr){
                sb.append(val).append(" ");
            }

            sb.append("\n");

            return;
        }

        for (int i = at; i < N; i++) {
            arr[depth] = i + 1;
            backTracking(i, depth +1);
        }
    }

}
