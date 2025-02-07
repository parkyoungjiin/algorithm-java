package baekjoon.p15649;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.*;


public class Main {
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    static boolean visit[];
    static int arr[];



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        N = Integer.parseInt(inputs[0]);
        M = Integer.parseInt(inputs[1]);

        visit = new boolean[N];
        arr = new int[M];
        backTracking(0);
        System.out.println(sb);

    }//main

    static void backTracking(int depth){
        //종료 조건
        if(depth == M){
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        //재귀
        for (int i = 0; i < N; i++) {
            //미방문
            if (!visit[i]) {
                visit[i] = true; //방문처리
                arr[depth] = i+1; //해당깊이에 i+1값 할당
                backTracking(depth+1);
                visit[i]= false;
            }
        }

    }
}
