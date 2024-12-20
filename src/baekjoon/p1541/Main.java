package baekjoon.p1541;

import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        // 1. '-' 기준으로 구분
        String[] nums = str.split("-");


        for (int i = 0; i <nums.length; i++){
            // 2. +가 있는 경우 괄호처리
            if (nums[i].contains("+")){
                // 3. + 기준으로 분리한 후 합계를 nums[i]에 갱신.
                String[] split = nums[i].split("\\+");
                int temp = 0;
                for (String s : split){
                    temp += Integer.parseInt(s);
                }

                nums[i] = Integer.toString(temp);
            }
        }

        int answer = Integer.parseInt(nums[0]);

        for (int k = 1 ; k < nums.length ; k++){
            answer -= Integer.parseInt(nums[k]);
        }

        System.out.println(answer);
    }


}
