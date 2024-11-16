package baekjoon.p2217;
import java.util.Arrays;
import java.lang.Math;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer [] lopes = new Integer[n];
        for (int i = 0 ; i < n; i++){
            int lope = Integer.parseInt(br.readLine()); // 최대 중량 입력값
            lopes[i] = lope;
        }

        Arrays.sort(lopes, Comparator.reverseOrder()); // 로프 최대중량 배열 내림차순 정렬
        int answer = 0;
        for (int k = 1; k <=n ; k++){ // k = 로프 개수
            int weight = lopes[k-1] * k; // 최대 무게

            answer = Math.max(weight, answer); // 큰 값으로 갱신
        }

        System.out.println(answer);


    }
}
