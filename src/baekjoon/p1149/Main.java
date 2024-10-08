package baekjoon.p1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arr[][] = new int[n][3]; // 자료형 변수명[][] = new 자료형[][]; -> 크기는 작성 필요(초기할당)
        int val[][] = new int[n][3];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            //한 줄마다 받기에 반복마다 토큰을 초기화 (한 줄 입력받기)
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            
        }

        val[0][0] = arr[0][0];
        val[0][1] = arr[0][1];
        val[0][2] = arr[0][2];
        for (int i = 1; i < n; i++) {
            val[i][0] = Math.min(arr[i][0] + val[i-1][1], arr[i][0] + val[i-1][2]);
            val[i][1] = Math.min(arr[i][1] + val[i-1][0], arr[i][1] + val[i-1][2]);
            val[i][2] = Math.min(arr[i][2] + val[i-1][0], arr[i][2] + val[i-1][1]);
        }

//        System.out.println("Arrays.deepToString(val) = " + Arrays.deepToString(val));

        int answer = Math.min(val[n-1][0], Math.min(val[n-1][1], val[n-1][2]));
        System.out.println(answer);


    }


}
