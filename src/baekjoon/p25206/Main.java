package baekjoon.p25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 전공평점 3.3 이상

        // 전공평점 계산 = 과목별합 / 학점 총합

        // P 등급 계산 제외
        Map<String, Double> table = new HashMap<>();
        table.put("A+", 4.5);
        table.put("A0", 4.0);
        table.put("B+", 3.5);
        table.put("B0", 3.0);
        table.put("C+", 2.5);
        table.put("C0", 2.0);
        table.put("D+", 1.5);
        table.put("D0", 1.0);
        table.put("F", 0.0);


        //학점 총합
        double credit = 0.0;
        //전공과목별 합
        double grade = 0.0;


        for (int i = 0 ; i < 20 ; i++){
            //과목명 학점 등급
            String [] input = br.readLine().split(" ");
            if (input[2].equals("P")){
                continue;
            }

            credit += Double.parseDouble(input[1]);
            grade += Double.parseDouble(input[1]) * table.get(input[2]);

        }

//        double answer = ;

        double answer = Math.round((grade / credit) * 1000000) / 1000000.0;

        System.out.println(answer);


















    }
}
