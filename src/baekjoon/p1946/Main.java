package baekjoon.p1946;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int t=0; t<tc; t++){
            ArrayList<Applicant> applicants = new ArrayList<>();

            int n = Integer.parseInt(br.readLine());

            for (int i = 0 ; i < n; i++){
                String [] scores = br.readLine().split(" ");

                Applicant applicant = new Applicant(Integer.parseInt(scores[0]), Integer.parseInt(scores[1]));

                applicants.add(applicant);
            }

            //서류 순위 기준 오름차순 정렬(class에 구현)
            Collections.sort(applicants);

            //합격자(서류 1등 자동합격)
            int cnt = 1;
            int pivot = applicants.get(0).interview_rank;
            //서류2등~ 합격자 처리 로직
            for (int i = 1; i<n; i++){
                //합격 처리 (면접 등수가 높은 경우, 절대적인 값은 작은 경우)
                if (applicants.get(i).interview_rank < pivot){
                    cnt++;
                    pivot = applicants.get(i).interview_rank;
                }
            }
            System.out.println(cnt);
        }//for


    }

    static class Applicant implements Comparable<Applicant>{
        int document_rank; //서류 등수
        int interview_rank; // 면접 등수

        //생성자
        public Applicant(int document_rank, int interview_rank){
            this.document_rank = document_rank;
            this.interview_rank = interview_rank;
        }

        // 서류 등수로 오름차순 정렬
        @Override
        public int compareTo(Applicant other){
            return Integer.compare(this.document_rank, other.document_rank);
        }


    }
}




