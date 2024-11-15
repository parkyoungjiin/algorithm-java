package baekjoon.p1026;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Arrays.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];
        Integer [] b = new Integer[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < n ; i++){

            b[i] = Integer.parseInt(st.nextToken());
        }

       Arrays.sort(a); // 오름차순
        Arrays.sort(b, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return Integer.compare(o2, o1);
            }
        }); // B를 내림차순으로 정렬

        int answer = 0;

        for (int i = 0; i < n; i++){
            answer += a[i] * b[i];
        }

        System.out.println(answer);



    }
}
