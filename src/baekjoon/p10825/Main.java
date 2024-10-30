package baekjoon.p10825;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> studentName = new ArrayList<>();
        ArrayList<int[]> studentScores = new ArrayList<>();
        for (int i = 0; i < n ; i++){
            int[] studentScore = new int[3];
            String [] students = br.readLine().split(" ");

            studentScore[0] = Integer.parseInt(students[1]);
            studentScore[1] = Integer.parseInt(students[2]);
            studentScore[2] = Integer.parseInt(students[3]);

            studentName.add(students[0]); // 학생 이름 add
            studentScores.add(studentScore); // 학생 성적 add

        }

        for (String s : studentName){
            System.out.println(s);
        }
        for (int[] sc : studentScores){
            for (int i = 0 ; i < sc.length; i++){
                System.out.println(sc[i]);
            }ㅊ
        }
    }


}