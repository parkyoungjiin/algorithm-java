package baekjoon.p10844;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    final static long mod = 1000000000;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 1<= n <=100

        long dp[][] = new long[n+1][10]; //[length][0~9]

        // 길이 = 1 인 계단수는 1가지로 고정.
        for (int i = 1; i < 10; i++){
            dp[1][i] = 1;
        }

        // 길이가 2~N까지 계단수 계산
        for (int i = 2; i <= n ; i++){
            for (int j = 0; j < 10; j++){ // 0 ~ 9 자릿수 자릿값들 저장.
                if (j == 0){ // 0이라면 이전 자릿수의 첫번째 자릿수만 가능.
                    dp[i][0] = dp[i-1][1];
                }else if(j == 9){
                    dp[i][9] = dp[i-1][8];
                }else{
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % mod;
                }
            }

        }//for
        long sum = 0;

        for (int i = 0; i < 10; i++){
            sum += dp[n][i];
        }
        System.out.println(sum % mod);
    }
}
