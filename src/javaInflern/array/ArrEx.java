package javaInflern.array;

import java.util.Scanner;

public class ArrEx {
    public static void main(String[] args) {
//        int student1 = 90;
//        int student2 = 80;
//        int student3 = 70;
//        int student4 = 60;
//        int student5 = 50;
//        int total = student1 + student2 + student3 + student4 + student5;
//        double average = (double) total / 5;
//        System.out.println("점수 총합: " + total);
//        System.out.println("점수 평균: " + average);


        //배열로 리팩토링
//        int[] students = {90, 80, 70, 60, 50};
//        int total = 0;
//        for (int student : students){
//            total += student;
//        }
//
//        double average = (double) total / students.length;
//        System.out.println("sum=" + total);
//        System.out.println("average =" + average);

        //5개 정수 입력
        Scanner sc = new Scanner(System.in);
        System.out.println("정수의 개수를 입력하세요.");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("정수를 입력하세요.");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers){
            System.out.println(num);
        }

        for (int ind=numbers.length; ind>0 ; ind--){
            System.out.println(ind);
        }



    }
}
