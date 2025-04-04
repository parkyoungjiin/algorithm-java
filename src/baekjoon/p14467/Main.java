package baekjoon.p14467;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> cow_arr = new HashMap<>();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            String [] input = br.readLine().split(" ");
            int cow_num = Integer.parseInt(input[0]);
            int move = Integer.parseInt(input[1]);

            //1. 건넌 기록 유무 확인
            if (cow_arr.containsKey(cow_num)) {
                if(cow_arr.get(cow_num) != move){
                    answer += 1;
                }
                cow_arr.replace(cow_num, move);

            }else{
                cow_arr.put(cow_num, move);
            }
        }
        System.out.println(answer);


    }
}
