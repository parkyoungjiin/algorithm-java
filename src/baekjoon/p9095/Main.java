package baekjoon.p9095;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int [] dp = new int [11];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;

        //dp 값 구하기
        for (int i = 3; i < 11; i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }


        for (int t=0; t<tc; t++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n-1]);


        }
    }
}
