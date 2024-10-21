package javaInflern.array;
import java.util.*;

public class ArrEx3 {
    public static void main(String[] args) {
        //사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
        int [][] scores = new int[4][3];
        Scanner sc = new Scanner(System.in);
        String [] subjects = {"국어", "수학", "영어"};

        //1번 학생의 성적을 입력하세요:
        //국어 점수:100
        //영어 점수:80
        //수학 점수:70
        //2번 학생의 성적을 입력하세요:
        //국어 점수:30
        //영어 점수:40
        //수학 점수:50
        //3번 학생의 성적을 입력하세요:
        //국어 점수:60
        //영어 점수:70
        //수학 점수:50
        //4번 학생의 성적을 입력하세요:
        //국어 점수:90
        //영어 점수:100
        //수학 점수:80
        for (int i =0 ; i<4; i++){
            System.out.println((i+1) + "번 학생의 성적을 입력하세요.");
//            int koreanScore = sc.nextInt();
//            int englishScore = sc.nextInt();
//            int mathScore = sc.nextInt();
//            scores[i][0] = koreanScore;
//            scores[i][1] = englishScore;
//            scores[i][2] = mathScore;
            for (int j = 0; j < subjects.length; j++){
                System.out.print(subjects[j] + "점수:");
                scores[i][j] = sc.nextInt();
            }
        }

        for (int i = 0 ; i < scores.length; i++){
            int total = 0;

            for (int j = 0 ; j<scores[i].length; j++){
                total += scores[i][j];
            }
            double avg = total / 3.0;
            System.out.println((i+1) + "번 학생의 총점:" + total);
            System.out.println((i+1) + "번 학생의 평균:" + Math.round(avg));
        }

    }
}
