package baekjoon.p10825;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; //StringTokenizer 인스턴스 정의
        int n = Integer.parseInt(br.readLine());
        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine()); //StringTokenizer 객체 생성
            String name = st.nextToken();
            int korea = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

//            Student student = new Student(name, korea, english, math);
            studentList.add(new Student(name, korea, english, math));
        }//for

        //Collections.sort
        Collections.sort(studentList, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2){

                //국어 동률
                if(o1.koreaScore == o2.koreaScore){
                    //국어=영어
                    if (o1.engScore == o2.engScore){
                        //국영수 동률
                        if (o1.mathScore == o2.mathScore){
                            //이름 사전순 정렬
                            return o1.studentName.compareTo(o2.studentName);
                        }
                        // 수학 내림
                        return o1.mathScore - o2.mathScore;
                    }
                    //영어 오름
                    return o1.engScore - o2.engScore;
                }


                //기본값 : 국어 감소
               return o2.koreaScore - o1.koreaScore;
            }
        });


    }//main

    static class Student{

        String studentName; //이름

        int koreaScore; //국어

        int engScore; //영어

        int mathScore; //수학

        //생성자
        public Student(String studentName, int koreaScore, int engScore, int mathScore){
            this.studentName = studentName;
            this.koreaScore = koreaScore;
            this.engScore = engScore;
            this.mathScore = mathScore;
        }
    }


}
