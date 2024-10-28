package baekjoon.p11057;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// 참고 링크 : https://velog.io/@yoonuk/%EB%B0%B1%EC%A4%80-11057-%EC%98%A4%EB%A5%B4%EB%A7%89-%EC%88%98-Java

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long mod = 10007;

        long [][] dp = new long[n+1][10];

        // length = 1
        for (int i = 0; i <= 9 ; i++){
            dp[1][i] = 1;
        }

        // length = 2~n
        for (int i = 2; i <= n ; i++){
            for (int j = 0; j <= 9; j++){
                for (int k = 0; k <= j; k++){
                    dp[i][j] += dp[i-1][k];
                }
                dp[i][j] %= mod;
            }
        }

        long result = 0;

        for (long d: dp[n]){
            result += d;
            result %= mod;
        }

        System.out.println(result % mod);






    }
}
