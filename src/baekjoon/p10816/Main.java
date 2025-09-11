package baekjoon.p10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //n
        int n = Integer.parseInt(br.readLine());
        String[] N = br.readLine().split(" ");
        int[] n_arr = new int[n];

        for (int i = 0; i < n; i++) {
            n_arr[i] = Integer.parseInt(N[i]);
        }
        //m
        int m = Integer.parseInt(br.readLine());
        String[] M = br.readLine().split(" ");
        int[] m_arr = new int[m];

        for (int i = 0; i < m; i++) {
            m_arr[i] = Integer.parseInt(M[i]);
        }

        Map<Integer, Integer> ans = new LinkedHashMap<>();
        //ans 초기화
        for(int i = 0; i < m; i++) {
            ans.put(m_arr[i], 0);
        }

        for (int a : n_arr) {
            if (ans.containsKey(a)) {
                ans.replace(a, ans.get(a) + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num: m_arr) {
            sb.append(ans.get(num)).append(" ");
        }
        System.out.println(sb);

    }
}