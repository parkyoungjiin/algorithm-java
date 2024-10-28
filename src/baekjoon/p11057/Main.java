package baekjoon.p11057;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

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
            long tempSum = 0;
            for (int j = 0; j <=9 ; j++){
                tempSum = (tempSum + dp[i-1][j]) % mod;
            }

            dp[i][0] = tempSum;

            for (int j = 1; j <= 9 ; j++){
                dp[i][j] = (dp[i][j-1] - (dp[i-1][j] + dp[i-2][j])) % mod;
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
