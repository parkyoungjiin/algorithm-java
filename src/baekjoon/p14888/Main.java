package baekjoon.p14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int MIN = Integer.MAX_VALUE;
    static int MAX = Integer.MIN_VALUE;
    static int[] input;
    static int[] operator = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        input = new int[N];
        String[] inputD = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(inputD[i]);
        }

        String[] operatorD = br.readLine().split(" ");

        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(operatorD[i]);
        }

        backTracking(input[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);
    }//main method

    public static void backTracking(int val, int index){
        //종료 조건
        if (index == N){
            MAX = Math.max(MAX, val);
            MIN = Math.min(MIN, val);
            return;
        }
        //연산자에 따른 계산
        if (operator[0] > 0) {
            operator[0]--;
            backTracking(val + input[index], index + 1);
            operator[0]++;
        }

        if (operator[1] > 0) {
            operator[1]--;
            backTracking(val - input[index], index + 1);
            operator[1]++;
        }

        if (operator[2] > 0) {
            operator[2]--;
            backTracking(val * input[index], index + 1);
            operator[2]++;
        }

        if (operator[3] > 0) {
            operator[3]--;
            backTracking(val / input[index], index + 1);
            operator[3]++;
        }

    }//backTrakcing
}//main class

