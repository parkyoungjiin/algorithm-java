package baekjoon.p11399;
import java.util.*;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] temp = br.readLine().split(" ");
        int [] nums = new int[temp.length];

        for (int i = 0; i < temp.length ; i++){
            nums[i] = Integer.parseInt(temp[i]);
        }

        Arrays.sort(nums);
        int [] time = new int[n]; // 인출 시간 저장 배열
        time[0] = nums[0];
        int answer = nums[0];

        for (int i = 1; i < n ; i++){
            time[i] = time[i-1] + nums[i];
            answer += time[i];
        }




        System.out.println(answer);


    }
}