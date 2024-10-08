package baekjoon.p1931;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // System.in -> 입력 스트림
        int n = in.nextInt(); // int 형 입력 받기

        int [][] meetting = new int[n][2];

        for (int i = 0; i < n; i++) {
            meetting[i][0] = in.nextInt(); // 시작
            meetting[i][1] = in.nextInt(); // 종료
        }
//        System.out.println("Arrays.deepToString(meetting) = " + Arrays.deepToString(meetting)); // 2차원 배열 출력

        // 종료시간 기준으로 정렬(같을 경우는 시작 시간이 빠른 순으로 정렬)

        Arrays.sort(meetting, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //종료 시간 같은 경우
                if (o1[1] == o2[1]) {
                    //시작 시간(0번지)가 빠른 값으로 정렬.(오름차순 ,내림차순은 o2-o1으로 하면 됨.)
                    return o1[0] - o2[0];
                }
                //기본 값은 종료 시간 정렬
                return o1[1] - o2[1]; //
            }
        });

//        System.out.println("Arrays.deepToString(meetting) = " + Arrays.deepToString(meetting)); // 2차원 배열 출력

        int answer = 1;

        int start = meetting[0][0];
        int end = meetting[0][1];

        for (int i = 1; i < n; i++) {
            int s = meetting[i][0];
            if (end <= s) {
                answer++;
                end = meetting[i][1];
            }

        }

        System.out.println("answer = " + answer);





    }


}
