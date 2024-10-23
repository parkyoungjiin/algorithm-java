package baekjoon.p10818;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int [] nums = new int[n];

        for (int i = 0; i < n ; i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        //output: 최솟값 최대값
        System.out.println(nums[0] + " " + nums[n-1]);







    }
}
