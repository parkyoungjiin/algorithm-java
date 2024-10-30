package baekjoon.p1292;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(0);

        for (int i = 1; i<=b; i++){ // i = 1 ~ b (i = 숫자)
            for (int j = 0 ; j < i ; j++){ // j = 0 ~ i-1 (j = i 반복횟수)
                arr.add(i);
            }
        }


        for (int i = a; i <=b ; i++){
            sum += arr.get(i);
        }

        System.out.println(sum);

    }
}