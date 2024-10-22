package baekjoon.p2501;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);


        ArrayList<Integer> arr = new ArrayList<>();

        // n의 약수 구하기
        for (int i = 1; i <= n; i++){
            if ((n % i) == 0){
                arr.add(i);
            }
        }

        // k개보다 약수가 적은경우 0
        if (arr.size() < k){
            System.out.println(0);
        }else{
            System.out.println(arr.get(k-1));
        }


    }
}
