package baekjoon.p1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        String[] input = br.readLine().split(" ");
//        int[] arr = new int[input.length];

        int m = Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");
        int[] ans = new int[m];


        Map<String, Integer> map = new HashMap<>();

        for (int i =0; i<input.length; i++){
            map.put(input[i], 1);
        }

        for (int j = 0; j < input2.length; j++) {
            if(map.containsKey(input2[j])){
                ans[j] = 1;
            }
        }

        for (int k = 0; k < m; k++) {
            System.out.println(ans[k]);
        }

    }
}
