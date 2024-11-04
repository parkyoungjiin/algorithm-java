package baekjoon.p1427;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
import java.util.Arrays;
import java.util.Comparator;



public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        char[] digits = input.toCharArray();

        Arrays.sort(digits); // 오름차순 정렬

        // 오름차순 숫자를 역순으로 출력
        for(int i = input.length() -1 ; i >= 0 ; i--){
            System.out.print(digits[i]);
        }




    }//main

}
