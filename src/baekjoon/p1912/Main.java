package baekjoon.p1912;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] arr = br.readLine().split(" ");
        int[] nums = new int[n];
        int[] dp = new int[n];
        //String -> int
        for (int i = 0; i < arr.length; i++){
            nums[i] = Integer.parseInt(arr[i]);
        }

        dp[0] = nums[0];
        int maxSum = nums[0];
        //DP 계산
        for (int i = 1; i < nums.length ; i++){
            dp[i] = Math.max(nums[i], (dp[i-1] + nums[i]));
            //최대값 갱신
            maxSum = Math.max(maxSum, dp[i]);

        }

        System.out.println(maxSum);

    }
}
