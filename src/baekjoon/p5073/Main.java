package baekjoon.p5073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, " ");

            //int 배열 선언
            int[] numbers = new int[3];
            for (int i = 0; i < 3; i++) {
                if (st.hasMoreTokens()) {
                    numbers[i] = Integer.parseInt(st.nextToken());
                }
            }
            // 0 0 0 인 경우 종료조건
            if (numbers[0] == 0 && numbers[1] == 0 && numbers[2] == 0) {
                break;
            }

            //배열 정렬
            Arrays.sort(numbers);

            if (numbers[2] >= numbers[0] + numbers[1]) {
                System.out.println("Invalid");
            } else if (numbers[0] == numbers[1] && numbers[1] == numbers[2] && numbers[0] == numbers[2]) {
                //세 변 모두 같은 경우
                System.out.println("Equilateral");
            } else if (numbers[0] == numbers[1] || numbers[0] == numbers[2] || numbers[1] == numbers[2]) {
                //2변만 같은 경우
                System.out.println("Isosceles");
            } else {
                //세 변 모두 다른 경우
                System.out.println("Scalene");
            }

        }
    }
}
