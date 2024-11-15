package baekjoon.p10817;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //a b c 중 두 번째로 큰 수
        String[] temp = br.readLine().split(" ");

        int[] nums = new int[3];

        for (int i = 0; i < temp.length; i++){
            nums[i] = Integer.parseInt(temp[i]);
        }

        Arrays.sort(nums);

        System.out.println(nums[1]);



    }//main close
}
