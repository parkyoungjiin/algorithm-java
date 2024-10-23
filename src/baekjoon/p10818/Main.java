package baekjoon.p10818;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] nums = sc.nextLine().split(" ");

        //output: 최솟값 최대값

        int minValue, maxValue;
        minValue = maxValue = Integer.parseInt(nums[0]);

        for (int i = 1 ; i <n; i++){
            int num = Integer.parseInt(nums[i]);

            if (num < minValue){
                minValue = num;
            }else if (num > maxValue){
                maxValue = num;
            }
        }

        System.out.println(minValue + " " + maxValue);

    }
}
