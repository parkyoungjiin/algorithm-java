package baekjoon.p2217;
import java.util.Arrays;
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
        int answer = lopes[0]; // 로프가 1개일 때 최대중량으로 설정.
        for (int k = 2; k <=n ; k++){ // k = 로프 개수
            for (int w = n; w <= 10000 ; w+=n){ // w = 무게
                int min_weight = lopes[k-1]; // min_weight = 가장 작은 하중
                int weight = w / k; // 로프 분할무게

                if (min_weight < weight){
                    break;
                }

                if (answer < w){ // k개 로프 사용 시 기존 무게보다 더 많이 들 수 있는 경우
                    answer = w;
                }
            }
        }

        System.out.println(answer);


    }
}
