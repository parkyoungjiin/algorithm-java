package baekjoon.p23971;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int h = Integer.valueOf(st.nextToken());
        int w = Integer.valueOf(st.nextToken());
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());

        int height = (h-1) / (n+1) + 1;
        int width = (w-1) / (m+1) + 1;

        int result = height * width;

        System.out.print(result);
    }
}
